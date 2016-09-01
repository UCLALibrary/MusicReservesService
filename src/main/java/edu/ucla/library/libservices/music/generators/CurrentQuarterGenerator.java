package edu.ucla.library.libservices.music.generators;

import edu.ucla.library.libservices.music.beans.CurrentQuarter;
import edu.ucla.library.libservices.music.db.mappers.CurrentQuarterMapper;
import edu.ucla.library.libservices.music.db.source.DataSourceFactory;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class CurrentQuarterGenerator
{
  private static final String QUERY = "SELECT * FROM Audio.dbo.CurrentQuarter";
  private DataSource          ds;
  private CurrentQuarter      currentQuarter;

  public CurrentQuarter getCurrentQuarter()
  {
    makeConnection();
    currentQuarter = ( CurrentQuarter ) new JdbcTemplate( ds ).queryForObject( QUERY, new CurrentQuarterMapper() );
    return currentQuarter;
  }

  private void makeConnection()
  {
    ds = DataSourceFactory.getMusicConnection();
  }

  public CurrentQuarterGenerator()
  {
    super();
  }
}
