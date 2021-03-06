package edu.ucla.library.libservices.music.services;

import edu.ucla.library.libservices.music.generators.ClassesGenerator;

import javax.servlet.ServletConfig;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

@Path( "/v2/classes" )
public class ClassesService
{
  @Context
  ServletConfig config;

  public ClassesService()
  {
    super();
  }

  @GET
  @Produces( "application/json" )
  public Response getClasses()
  {
    ClassesGenerator docMaker;

    docMaker = new ClassesGenerator();

    return Response.ok( docMaker.getAllClasses() ).build();
  }
}
