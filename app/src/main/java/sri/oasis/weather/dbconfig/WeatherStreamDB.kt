package sri.oasis.weather.dbconfig

import com.raizlabs.android.dbflow.annotation.Database


@Database(name = WeatherStreamDB.NAME, version = WeatherStreamDB.VERSION)
class WeatherStreamDB {
    companion object {
        const val NAME = "WeatherStream"
        const val VERSION = 1
    }
}