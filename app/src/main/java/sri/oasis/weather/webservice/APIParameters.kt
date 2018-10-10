package sri.oasis.weather.webservice

import java.util.*



object APIParameters {

    fun getParam(): HashMap<String, String> = HashMap()

    class LocationSearch {
        companion object {
            val apiKey = "apikey"
            val lat = "lat"
            val lon = "lon"
            val type = "type"
            val units = "units"
        }
    }

    class  ForecastingWeather {
        companion object {
            val apiKey = "apikey"
            val lat = "lat"
            val lon = "lon"
            val units = "units"
            val type = "type"
        }
    }
}