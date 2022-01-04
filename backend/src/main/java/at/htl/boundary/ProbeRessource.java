package at.htl.boundary;

import at.htl.controller.ProbeRepository;
import at.htl.entity.Probe;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.Validator;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Path("/Probe")
public class ProbeRessource {

    @Inject
    ProbeRepository probeRepository;

    @Inject
    Validator validator;

    @GET
    @Path("findAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Probe> getDevices(){
        return probeRepository.findAll();
    }

    @Path("/manual-validation")
    @POST
    public Result tryMeManualValidation(Probe probe) {
        Set<ConstraintViolation<Probe>> violations = validator.validate(probe);
        if (violations.isEmpty()) {
            return new Result("Lesson is valid! It was validated by manual validation.");
        } else {
            return new Result(violations);
        }
    }

    @Path("/end-point-method-validation")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Result tryMeEndPointMethodValidation(@Valid Probe probe) {
        return new Result("Probe is valid! It was validated by end point method validation.");
    }

    @Path("/service-method-validation")
    @POST
    public Result tryMeServiceMethodValidation(Probe probe) {
        try {
            ProbeRepository.validateProbe(probe);
            return new Result("Lesson is valid! It was validated by service method validation.");
        } catch (ConstraintViolationException e) {
            return new Result(e.getConstraintViolations());
        }
    }

    public static class Result {

        Result(String message) {
            this.success = true;
            this.message = message;
        }

        Result(Set<? extends ConstraintViolation<?>> violations) {
            this.success = false;
            this.message = violations.stream()
                    .map(cv -> cv.getMessage())
                    .collect(Collectors.joining(", "));
        }

        private String message;
        private boolean success;

        public String getMessage() {
            return message;
        }

        public boolean isSuccess() {
            return success;
        }

    }

}
