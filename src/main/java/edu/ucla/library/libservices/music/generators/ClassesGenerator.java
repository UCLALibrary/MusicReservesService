package edu.ucla.library.libservices.music.generators;

import edu.ucla.library.libservices.music.beans.Classes;

public class ClassesGenerator
{
  private Classes allClasses;

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
