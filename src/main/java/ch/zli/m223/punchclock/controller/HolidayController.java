package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.service.HolidayService;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/holidays")
@Tag(name = "Holidays", description = "Handling of holidays")
public class HolidayController {


    @Inject
    HolidayService holidayService;

}
