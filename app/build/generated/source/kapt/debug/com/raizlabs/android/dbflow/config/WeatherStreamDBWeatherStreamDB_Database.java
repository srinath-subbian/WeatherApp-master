package com.raizlabs.android.dbflow.config;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import sri.oasis.weather.dbconfig.WeatherStreamDB;
import sri.oasis.weather.model.Clouds_Table;
import sri.oasis.weather.model.Coord_Table;
import sri.oasis.weather.model.ForecastList_Table;
import sri.oasis.weather.model.LocationSearchHistory_Table;
import sri.oasis.weather.model.Main_Table;
import sri.oasis.weather.model.Rain_Table;
import sri.oasis.weather.model.Sys_Table;
import sri.oasis.weather.model.WeatherData_Table;
import sri.oasis.weather.model.WeatherForecastData_Table;
import sri.oasis.weather.model.Weather_Table;
import sri.oasis.weather.model.Wind_Table;

/**
 * This is generated code. Please do not modify */
public final class WeatherStreamDBWeatherStreamDB_Database extends DatabaseDefinition {
  public WeatherStreamDBWeatherStreamDB_Database(DatabaseHolder holder) {
    addModelAdapter(new Clouds_Table(this), holder);
    addModelAdapter(new Coord_Table(this), holder);
    addModelAdapter(new ForecastList_Table(this), holder);
    addModelAdapter(new LocationSearchHistory_Table(this), holder);
    addModelAdapter(new Main_Table(this), holder);
    addModelAdapter(new Rain_Table(this), holder);
    addModelAdapter(new Sys_Table(this), holder);
    addModelAdapter(new WeatherData_Table(this), holder);
    addModelAdapter(new WeatherForecastData_Table(this), holder);
    addModelAdapter(new Weather_Table(this), holder);
    addModelAdapter(new Wind_Table(this), holder);
  }

  @Override
  public final Class<?> getAssociatedDatabaseClassFile() {
    return WeatherStreamDB.class;
  }

  @Override
  public final boolean isForeignKeysSupported() {
    return false;
  }

  @Override
  public final boolean backupEnabled() {
    return false;
  }

  @Override
  public final boolean areConsistencyChecksEnabled() {
    return false;
  }

  @Override
  public final int getDatabaseVersion() {
    return 1;
  }

  @Override
  public final String getDatabaseName() {
    return "WeatherStream";
  }
}
