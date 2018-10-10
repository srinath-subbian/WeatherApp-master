package sri.oasis.weather.webservice


import sri.oasis.weather.model.WeatherData
import sri.oasis.weather.model.WeatherForecastData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.QueryMap
import sri.oasis.weather.BuildConfig
import java.util.*


interface WebApis {

    @GET("weather")
    fun getWeatherDetail(@Header(BuildConfig.KEY_AUTH) key: String, @QueryMap params: java.util.HashMap<String, String>): Call<WeatherData>

    @GET("forecast")
    fun getWeatherForecasting(@Header(BuildConfig.KEY_AUTH) key: String, @QueryMap params: HashMap<String, String>): Call<WeatherForecastData>
}