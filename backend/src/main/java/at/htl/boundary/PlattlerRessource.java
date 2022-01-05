package at.htl.boundary;

import at.htl.controller.PlattlerRepository;
import at.htl.entity.Plattler;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/plattler")
public class PlattlerRessource {

    @Inject
    PlattlerRepository plattlerRepository;

    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance plattler(Plattler plattler);
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("name")String name){
        return Templates.plattler(plattlerRepository.getPlattlerByName(name));
    }


    @Path("/findAll")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Plattler> findAll(){
        return plattlerRepository.getAll();
    }
}