package edu.ucla.library.libservices.music.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType( XmlAccessType.FIELD )
public class Work
{
  @XmlElement(name = "isVideo")
  private boolean isVideo;
  @XmlElement(name = "httpURL")
  private String httpURL;
  @XmlElement(name = "rtmpURL")
  private String rtmpURL;

  public void setIsVideo( boolean isVideo )
  {
    this.isVideo = isVideo;
  }

  public boolean isIsVideo()
  {
    return isVideo;
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

  public Work()
  {
    super();
  }
}
