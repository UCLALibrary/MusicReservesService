package edu.ucla.library.libservices.music.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType( XmlAccessType.FIELD )
public class Item
{
  @XmlElement(name = "trackTitle")
  private String trackTitle;
  @XmlElement(name = "volume")
  private String volume;
  @XmlElement(name = "disc")
  private String disc;
  @XmlElement(name = "side")
  private String side;
  @XmlElement(name = "trackNumber")
  private String trackNumber;
  @XmlElement(name = "httpURL")
  private String httpURL;
  @XmlElement(name = "rtmpURL")
  private String rtmpURL;

  public Item()
  {
    super();
  }

  public void setTrackTitle( String trackTitle )
  {
    this.trackTitle = trackTitle;
  }

  public String getTrackTitle()
  {
    return trackTitle;
  }

  public void setVolume( String volume )
  {
    this.volume = volume;
  }

  public String getVolume()
  {
    return volume;
  }

  public void setDisc( String disc )
  {
    this.disc = disc;
  }

  public String getDisc()
  {
    return disc;
  }

  public void setSide( String side )
  {
    this.side = side;
  }

  public String getSide()
  {
    return side;
  }

  public void setTrackNumber( String trackNumber )
  {
    this.trackNumber = trackNumber;
  }

  public String getTrackNumber()
  {
    return trackNumber;
  }

  public void setHttpURL( String httpURL )
  {
    this.httpURL = httpURL;
  }

  public String getHttpURL()
  {
    return httpURL;
  }

  public void setRtmpURL( String rtmpURL )
  {
    this.rtmpURL = rtmpURL;
  }

  public String getRtmpURL()
  {
    return rtmpURL;
  }
}
