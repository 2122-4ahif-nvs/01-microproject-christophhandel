package at.htl.boundary;

import at.htl.controller.ProbeRepository;
import at.htl.entity.Probe;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/Probe")
public class ProbeRessource {

    @Inject
    ProbeRepository probeRepository;

    @GET
    @Path("findAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Probe> getDevices(){
        return probeRepository.findAll();
    }

}
