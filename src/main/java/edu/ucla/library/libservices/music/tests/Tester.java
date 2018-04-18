package edu.ucla.library.libservices.music.tests;

import edu.ucla.library.libservices.music.beans.Course;

import edu.ucla.library.libservices.music.beans.Item;
import edu.ucla.library.libservices.music.beans.Work;
import edu.ucla.library.libservices.music.generators.CourseGenerator;

import edu.ucla.library.libservices.music.generators.WorkGenerator;

import java.util.List;

public class Tester
{
  public Tester()
  {
    super();
  }

  public static void main( String[] args )
  {
    String[] ids = new String[]{"430744200","430150200","430434200","434331200","433522200","830134200","433455200","413354200","430340200","436523200"};
    WorkGenerator generator;
    List<Work> works;
    generator = new WorkGenerator();
    
    for (String srs : ids )
    {
      System.out.println( "SRS = " + srs );
      generator.setSrs( srs );
      works = generator.getWorks();
    }
    /*CourseGenerator geenrator;
    List<Course>    courses;

    geenrator = new CourseGenerator();
    courses = geenrator.getCourses();

    for ( Course theCourse: courses )
    {
      List<Work> works;

      System.out.println( "SRS = " + theCourse.getSrs() + "\tTerm = " + theCourse.getTerm() );
      works = theCourse.getWorks();
      for ( Work theWork : works )
      {
        List<Item> items;

        System.out.println( "ID = " + theWork.getWorkID() + "\tComposer = " + theWork.getComposer() + "\tTitle = " + theWork.getTitle() );
        items = theWork.getItems();
        for ( Item theItem : items )
          System.out.println( "\t\tTitle = " + theItem.getTrackTitle() + "\tURL = " + theItem.getHttpURL() );
      }
    }*/
  }
}
