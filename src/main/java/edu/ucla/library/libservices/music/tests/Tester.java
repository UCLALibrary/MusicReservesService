package edu.ucla.library.libservices.music.tests;

import edu.ucla.library.libservices.music.beans.Classes;
import edu.ucla.library.libservices.music.beans.Course;
import edu.ucla.library.libservices.music.beans.CurrentQuarter;
import edu.ucla.library.libservices.music.beans.Work;
import edu.ucla.library.libservices.music.generators.ClassesGenerator;
import edu.ucla.library.libservices.music.generators.CourseGenerator;
import edu.ucla.library.libservices.music.generators.CurrentQuarterGenerator;
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
    ClassesGenerator tester;
    Classes          allClasses;
    tester = new ClassesGenerator();
    allClasses = tester.getAllClasses();

    List<Course> courses;
    courses = allClasses.getCourses();

    for ( Course theCourse: courses )
    {
      System.out.println( "course = " + theCourse.getSrs() + "\tterm = " + theCourse.getTerm() );
      List<Work> works = theCourse.getWorks();
      for ( Work theWork: works )
        System.out.println( "\tis video ? " + theWork.isIsVideo() + "\tdisplay is " + theWork.getDisplay() +
                            "\n\tHTTP URL = " + theWork.getHttpURL() );
    }

  }
}
