package sri.oasis.weather.webservice


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import sri.oasis.weather.BuildConfig

open class NetworkConfig {
    companion object {
        private  var retrofitInstance: Retrofit? = null
        private var webApi: WebApis? = null

        fun getRetrofit(): Retrofit {
            if (retrofitInstance == null) {

                retrofitInstance = Retrofit.Builder()
                        .baseUrl(BuildConfig.BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            }
            return retrofitInstance!!
        }

        fun getWebApis(): WebApis {
            if (webApi == null) {
                webApi = getRetrofit().create(WebApis::class.java)
            }
            return webApi!!
        }
    }
}