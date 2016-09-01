package edu.ucla.library.libservices.music.beans;

public class CurrentQuarter
{
  private String year;
  private String quarter;

  public void setYear( String year )
  {
    this.year = year;
  }

  public String getYear()
  {
    return year;
  }

  public void setQuarter( String quarter )
  {
    this.quarter = quarter;
  }

  public String getQuarter()
  {
    return quarter;
  }

  public CurrentQuarter()
  {
    super();
  }
}
