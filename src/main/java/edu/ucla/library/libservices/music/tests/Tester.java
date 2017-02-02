package edu.ucla.library.libservices.music.tests;

import edu.ucla.library.libservices.music.beans.Course;

import edu.ucla.library.libservices.music.beans.Item;
import edu.ucla.library.libservices.music.beans.Work;
import edu.ucla.library.libservices.music.generators.CourseGenerator;

import java.util.List;

public class Tester
{
  public Tester()
  {
    super();
  }

  public static void main( String[] args )
  {
    CourseGenerator geenrator;
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

        System.out.println( "\tComposer = " + theWork.getComposer() + "\tTitle = " + theWork.getTitle() );
        items = theWork.getItems();
        for ( Item theItem : items )
          System.out.println( "\t\tTitle = " + theItem.getTrackTitle() + "\tURL = " + theItem.getHttpURL() );
      }
    }
  }
}
