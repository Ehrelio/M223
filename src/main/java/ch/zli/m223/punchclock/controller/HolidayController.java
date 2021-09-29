package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Holiday;
import ch.zli.m223.punchclock.service.HolidayService;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.resteasy.annotations.jaxrs.PathParam;


import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/holidays")
@Tag(name = "Holidays", description = "Handling of holidays")
public class HolidayController {


    @Inject
    HolidayService holidayService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Holiday getHoliday(@PathParam Long id){
        return holidayService.getHoliday(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Add new Holiday", description = "The newly created holiday is returned. The id may not be passed")
    public Holiday add(Holiday holiday){
        return holidayService.createHoliday(holiday);
    }

    @DELETE
    @Operation(summary = "deletes one object", description = "")
    @Path("/{id}")
    public void delete(@PathParam Long id){
        holidayService.delHolidayId(id);
    }

    @DELETE
    @Operation(summary = "deletes one object", description = "")
    @Consumes(MediaType.APPLICATION_JSON)
    public void delete(Holiday holiday){
        holidayService.delHolidayObject(holiday);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Holiday update(Holiday holiday){
        return holidayService.updateHoliday(holiday);
    }
}