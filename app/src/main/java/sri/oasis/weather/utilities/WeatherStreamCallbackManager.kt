package sri.oasis.weather.utilities

class WeatherStreamCallbackManager: WeatherStreamCallback {

    companion object {
        var weatherStreamCallbacks: MutableList<WeatherStreamCallback>? = null

        fun addWishCallBack(weatherStreamCallback: WeatherStreamCallback) {
            initList()
            if (!weatherStreamCallbacks!!.contains(weatherStreamCallback)) {
                weatherStreamCallbacks!!.add(weatherStreamCallback)
            }
        }

        fun removeWishCallBack(weatherStreamCallback: WeatherStreamCallback) {
            initList()
            if (weatherStreamCallbacks!!.contains(weatherStreamCallback)) {
                weatherStreamCallbacks!!.remove(weatherStreamCallback)
            }
        }

        fun updateHomeScreenData (type: Int) {
            if (weatherStreamCallbacks == null || weatherStreamCallbacks!!.isEmpty()) return

            for (i in weatherStreamCallbacks!!) {
                i.onSearchLocationAction(type)
            }
        }
        private fun initList() {
            if (weatherStreamCallbacks == null) {
                weatherStreamCallbacks = ArrayList()
            }
        }
    }

    override fun onSearchLocationAction(type: Int) {
    }
}