package sri.oasis.weather.webservice

import retrofit2.Call


class APIUtil {
    fun cancelCall(call: Call<*>?) {

        if (call != null && !call.isCanceled) {
            call.cancel()
        }
    }
}