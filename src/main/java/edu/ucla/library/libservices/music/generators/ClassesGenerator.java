package edu.ucla.library.libservices.music.generators;

import edu.ucla.library.libservices.music.beans.Classes;
import edu.ucla.library.libservices.music.beans.SimpleClasses;

public class ClassesGenerator
{
  private Classes allClasses;
  private SimpleClasses allSimples;

  public SimpleClasses getAllSimples()
  {
    CourseGenerator generator;

    generator = new CourseGenerator();
    allSimples = new SimpleClasses();
    allSimples.setCourses( generator.getSimpleCourses() );

    return allSimples;
  }

  public Classes getAllClasses()
  {
    CourseGenerator generator;

    generator = new CourseGenerator();
    allClasses = new Classes();
    allClasses.setCourses( generator.getCourses() );

    return allClasses;
  }

  public ClassesGenerator()
  {
    super();
  }
}
