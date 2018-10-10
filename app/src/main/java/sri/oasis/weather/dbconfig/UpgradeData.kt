package sri.oasis.weather.dbconfig

import sri.oasis.weather.model.LocationSearchHistory
import sri.oasis.weather.model.WeatherData
import sri.oasis.weather.model.WeatherForecastData
import com.raizlabs.android.dbflow.sql.language.Delete



object UpgradeData {

    fun clearApplicationData() {
        Delete.table(WeatherData::class.java)
        Delete.table(WeatherData.Sys::class.java)
        Delete.table(WeatherData.Weather::class.java)
        Delete.table(WeatherData.Wind::class.java)
        Delete.table(WeatherData.Coord::class.java)
        Delete.table(WeatherData.Clouds::class.java)
        Delete.table(WeatherData.Main::class.java)
        Delete.table(WeatherForecastData::class.java)
        Delete.table(WeatherForecastData.Rain::class.java)
        Delete.table(WeatherForecastData.ForecastList::class.java)
    }

    fun clearSearchHistory() {
        Delete.table(LocationSearchHistory::class.java)
    }
}
