package sa.activities.resource;

import sa.activities.model.Activity;
import sa.activities.service.ActivityService;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

@Path("/Activity")
public class ActivityResource {

    @Context
    UriInfo uriInfo;

    @EJB
    ActivityService activityService;

    @GET
    public Response  checkActivity(){
        return Response.status(Response.Status.CREATED).build();

    }

    @GET
    @Path("{id}")
    public Activity getActivityByID(@PathParam("id") int id){
        return activityService.getActivityById(id);
    }

    @POST
    public Response  createActivity(Activity activity){
        activityService.createActivity(activity);
        return Response.status(Response.Status.CREATED).build();
    }
}
