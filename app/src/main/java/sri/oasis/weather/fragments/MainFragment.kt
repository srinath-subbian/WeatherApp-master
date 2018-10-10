package sri.oasis.weather.fragments

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.text.TextUtils.TruncateAt
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.matteobattilana.weather.WeatherDataAnim
import com.github.matteobattilana.weather.WeatherViewSensorEventListener
import sri.oasis.weather.Methods

import sri.oasis.weather.adapters.ForecastItemAdapter
import sri.oasis.weather.model.WeatherData
import sri.oasis.weather.model.WeatherForecastData

import sri.oasis.weather.widgets.StickySwitch
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.leftmenu.*
import kotlinx.android.synthetic.main.settingmenu.*
import kotlinx.android.synthetic.main.toolbar_ui.*
import sri.oasis.weather.R
import sri.oasis.weather.utilities.*
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*


class MainFragment : BaseFragment(), View.OnClickListener, StickySwitch.OnSelectedChangeListener {
    lateinit var weatherSensor: WeatherViewSensorEventListener

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater!!.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        llNoLocationFound.visibility = View.GONE
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        weatherSensor = WeatherViewSensorEventListener(mActivity, weatherView)

        WeatherStreamCallbackManager.addWishCallBack(addWeatherStreamCallBack)
        recyclerViewDaysWeather.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(mActivity, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewDaysWeather.layoutManager = layoutManager
        val lists: List<WeatherForecastData.ForecastList>? = WeatherForecastData.ForecastList.getForecastList()
        val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
        if (weatherData != null) {
            recyclerViewDaysWeather.adapter = ForecastItemAdapter(preferenceUtil, weatherData.name!!, lists!!, mActivity)
        }

        btnSearchLocation.setOnClickListener(this)
        tvDirectionView.setOnClickListener(this)
        tvDirectionLabel.setOnClickListener(this)


        if (!preferenceUtil.getBooleanPref(preferenceUtil.IS_APP_THEME_DAY)) {
            llNoLocationFound.setBackgroundColor(ContextCompat.getColor(mActivity, R.color.gulf_blue_dark))
            tvSearchViewHeading.setTextColor(ContextCompat.getColor(mActivity, R.color.font_white_trans))
            tvSearchViewMessage.setTextColor(ContextCompat.getColor(mActivity, R.color.font_thirdly))

            toolbar.setBackgroundColor(ContextCompat.getColor(mActivity, R.color.gulf_blue))
            llTopView.setBackgroundColor(ContextCompat.getColor(mActivity, R.color.gulf_blue))
            rlMainFragmentParent.setBackgroundColor(ContextCompat.getColor(mActivity, R.color.gulf_blue_dark))
            recyclerViewDaysWeather.setBackgroundColor(ContextCompat.getColor(mActivity, R.color.gulf_blue_dark))
            llMiddleView.setCardBackgroundColor(ContextCompat.getColor(mActivity, R.color.cornflower_blue))
            stickySwitch.sliderBackgroundColor = ContextCompat.getColor(mActivity, R.color.gulf_blue)

            tvRainPrecipitationView.setTextColor(ContextCompat.getColor(mActivity, R.color.font_white))
            tvHumidityView.setTextColor(ContextCompat.getColor(mActivity, R.color.font_white))
            tvWindView.setTextColor(ContextCompat.getColor(mActivity, R.color.font_white))
            tvDirectionView.setTextColor(ContextCompat.getColor(mActivity, R.color.font_white))

            tvRainPrecipitationLabel.setTextColor(ContextCompat.getColor(mActivity, R.color.font_primary))
            tvHumidityLabel.setTextColor(ContextCompat.getColor(mActivity, R.color.font_primary))
            tvWindLabel.setTextColor(ContextCompat.getColor(mActivity, R.color.font_primary))
            tvDirectionLabel.setTextColor(ContextCompat.getColor(mActivity, R.color.font_primary))
        }

        setWeatherDetails()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        WeatherStreamCallbackManager.removeWishCallBack(addWeatherStreamCallBack)
    }

    override fun onSelectedChange(direction: StickySwitch.Direction, text: String) {
        if (direction == StickySwitch.Direction.LEFT) {
            preferenceUtil.setBooleanPref(preferenceUtil.IS_TEMPERATURE_UNIT_CELCIUS, true)
            mActivity.rbCelsius.isChecked = true
            if (mActivity.rvMenuLocationList.adapter != null) {
                mActivity.rvMenuLocationList.adapter.notifyDataSetChanged()
            }

            setWeatherDetails()

            val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
            if (weatherData != null) {
                val lists: List<WeatherForecastData.ForecastList>? = WeatherForecastData.ForecastList.getForecastList()
//                recyclerViewDaysWeather.adapter = ForecastItemAdapter(preferenceUtil, weatherData.name!!, lists!!, mActivity)
                recyclerViewDaysWeather?.adapter?.notifyDataSetChanged()
            }
        } else {
            preferenceUtil.setBooleanPref(preferenceUtil.IS_TEMPERATURE_UNIT_CELCIUS, false)
            mActivity.rbFahrenheit.isChecked = true
            if (mActivity.rvMenuLocationList.adapter != null) {
                mActivity.rvMenuLocationList.adapter.notifyDataSetChanged()
            }

            setWeatherDetails()

            val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
            if (weatherData != null) {
                val lists: List<WeatherForecastData.ForecastList>? = WeatherForecastData.ForecastList.getForecastList()
                recyclerViewDaysWeather.adapter = ForecastItemAdapter(preferenceUtil, weatherData.name!!, lists!!, mActivity)
                recyclerViewDaysWeather?.adapter?.notifyDataSetChanged()
            }
        }
    }

    fun setWeatherData(weatherDataAnim: WeatherDataAnim) {
        weatherView.setWeatherData(weatherDataAnim)
    }

    override fun onClick(v: View?) {
        when (v) {
            toggleMenu -> {
                Methods.avoidDoubleClicks(toggleMenu)
                mActivity.slidingMenuLeft?.clearIgnoredViews()
                if (mActivity.slidingMenuRight?.isMenuShowing!!) {
                    mActivity.slidingMenuRight!!.toggle()
                }
                mActivity.slidingMenuLeft?.showMenu(true)
            }
            ivSetting -> {
                Methods.avoidDoubleClicks(ivSetting)
                mActivity.toggleSlideMenuRight()
            }
            btnSearchLocation -> {
                Methods.avoidDoubleClicks(btnSearchLocation)
                mActivity.showGoogleAutoLocationSearch("")
            }
            tvDirectionView, tvDirectionLabel -> {
                Methods.avoidDoubleClicks(tvDirectionView)
                showInfoDialog()
            }
            else -> {
            }
        }
    }

    override fun onResume() {
        super.onResume()
        weatherSensor.onResume()
    }

    override fun onPause() {
        super.onPause()
        weatherSensor.onPause()
    }

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        if (!hidden && isAdded) {
            val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
            if (weatherData != null) {
                initToolbar(weatherData.name!!)
            }
        }
    }

    /***
     * Method for initialise Toolbar
     * */
    @SuppressLint("SetTextI18n")
    private fun initToolbar(header: String) {
        tvToolbarTitle.text = header
        toggleMenu?.visibility = View.VISIBLE
        ivSetting?.visibility = View.VISIBLE
        backNavigation?.visibility = View.GONE
        tvToolbarTitle?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24F)
        toggleMenu.setOnClickListener(this)
        ivSetting.setOnClickListener(this)
        ivSetting.setOnClickListener(this)

        toggleMenu.tag = 0

        stickySwitch.onSelectedChangeListener = this

        try {
            tvToolbarTitle.ellipsize = TruncateAt.MARQUEE
            tvToolbarTitle.isFocusable = true
            tvToolbarTitle.isFocusableInTouchMode = true
            tvToolbarTitle.requestFocus()
            tvToolbarTitle.setSingleLine(true)
            tvToolbarTitle.isSelected = true
            tvToolbarTitle.marqueeRepeatLimit = -1

        } catch (e: NoSuchFieldException) {
        } catch (e: IllegalAccessException) {
        }
    }

    fun setWeatherDetails() {
        llNoLocationFound.visibility = View.GONE
        val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
        val sysWeatherData: WeatherData.Sys? = WeatherData.Sys.getSysWeatherDetails()

        val mainWeatherData: WeatherData.Main? = WeatherData.Main.getMainWeatherDetails()
        val cloudWeatherData: WeatherData.Clouds? = WeatherData.Clouds.getCloudWeatherDetails()
        val inWeatherData: WeatherData.Weather? = WeatherData.Weather.getInnerWeatherDetails()
        val windWeatherData: WeatherData.Wind? = WeatherData.Wind.getWindWeatherDetails()

        if (weatherData != null && sysWeatherData != null && inWeatherData != null) {
            initToolbar(weatherData.name!!)

            if (sysWeatherData.country != null) {
                val loc = Locale("", sysWeatherData.country)
                tvCountryAdd?.text = loc.displayCountry
            }

            if (preferenceUtil.getBooleanPref(preferenceUtil.IS_TEMPERATURE_UNIT_CELCIUS)) {
                stickySwitch.setDirection(StickySwitch.Direction.LEFT, true)
                tvAverageTemperatureView?.text = Math.round(mainWeatherData?.temp?.toDouble()!!).toString().plus(mResources.getString(R.string.temp_degree_sign))
                tvTemperatureMinV?.text = Math.round(mainWeatherData.temp_min?.toDouble()!!).toString().plus(mResources.getString(R.string.temperature_low))
                tvTemperatureMaxV?.text = Math.round(mainWeatherData.temp_max?.toDouble()!!).toString().plus(mResources.getString(R.string.temperature_high))
            } else {
                stickySwitch.setDirection(StickySwitch.Direction.RIGHT, true)
                tvAverageTemperatureView?.text = Math.round(Methods.convertCelsiusToFahrenheit(mainWeatherData?.temp?.toFloat()!!)).toString().plus(mResources.getString(R.string.temp_degree_sign))
                tvTemperatureMinV?.text = Math.round(Methods.convertCelsiusToFahrenheit(mainWeatherData.temp_min?.toFloat()!!)).toString().plus(mResources.getString(R.string.temperature_low))
                tvTemperatureMaxV?.text = Math.round(Methods.convertCelsiusToFahrenheit(mainWeatherData.temp_max?.toFloat()!!)).toString().plus(mResources.getString(R.string.temperature_high))
            }

            tvWeatherTypeView?.text = inWeatherData.description
            tvDateTime?.text = DateUtil.getDateFromMillis(weatherData.dt, DateUtil.dateDisplayFormat1, true)
            tvHumidityView?.text = mainWeatherData.humidity?.plus("%")
            if (cloudWeatherData?.all != null) {
                tvRainPrecipitationView?.text = cloudWeatherData.all.toString().plus("%")
            }
            if (windWeatherData?.speed != null) {
                val numberFormat: NumberFormat = DecimalFormat("#.0000") as NumberFormat
                if (preferenceUtil.getBooleanPref(preferenceUtil.IS_SPEED_UNIT_METERS)) {
                    tvWindView?.text = windWeatherData.speed?.plus(mResources.getString(R.string.ms_speed))
                } else {
                    tvWindView?.text = numberFormat.format(Methods.getMiles(windWeatherData.speed?.toFloat()!!)).toString().plus(mResources.getString(R.string.mph_speed))
                }
            }

            weatherView.visibility = View.VISIBLE
            iv_weather_type.setImageResource(WeatherToImage.getWeatherTypeConditionCode(this@MainFragment, weatherView, inWeatherData.id?.toString()!!))

            if (windWeatherData?.deg != null) {
                tvDirectionView?.text = DegreeToWindDirection.getWindDirection(mActivity, windWeatherData.deg?.toDouble()!!)
            }
        } else {
            llNoLocationFound.visibility = View.VISIBLE
        }
    }

    private var addWeatherStreamCallBack: WeatherStreamCallback = object : WeatherStreamCallback {
        override fun onSearchLocationAction(type: Int) {
            if (type == 1) {
                setWeatherDetails()
            }

            if (type == 2) {
                val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
                if (weatherData != null) {
                    val lists: List<WeatherForecastData.ForecastList>? = WeatherForecastData.ForecastList.getForecastList()
                    recyclerViewDaysWeather.adapter = ForecastItemAdapter(preferenceUtil, weatherData.name!!, lists!!, mActivity)
                    recyclerViewDaysWeather.adapter?.notifyDataSetChanged()
                }
            }

            if (type == 3) {

                setWeatherDetails()

                val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
                if (weatherData != null) {
                    val lists: List<WeatherForecastData.ForecastList>? = WeatherForecastData.ForecastList.getForecastList()
                    recyclerViewDaysWeather.adapter = ForecastItemAdapter(preferenceUtil, weatherData.name!!, lists!!, mActivity)
                    recyclerViewDaysWeather?.adapter?.notifyDataSetChanged()
                }
            }
            if (type == 4) {
                setWeatherDetails()

                val weatherData: WeatherData? = WeatherData.getLocationBasedWeatherDetails()
                if (weatherData != null) {
                    val lists: List<WeatherForecastData.ForecastList>? = WeatherForecastData.ForecastList.getForecastList()
                    try {
//                        recyclerViewDaysWeather.adapter = ForecastItemAdapter(preferenceUtil, weatherData.name!!, lists!!, mActivity)
                        recyclerViewDaysWeather?.adapter?.notifyDataSetChanged()
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
        }
    }

    private fun showInfoDialog() {
        val dialogBuilder = AlertDialog.Builder(mActivity)
        val inflater = this.layoutInflater
        val dialogView = inflater.inflate(R.layout.alert_dialog_layout, null)
        dialogBuilder.setView(dialogView)

        dialogBuilder.setNegativeButton(mActivity.resources.getString(R.string.close), DialogInterface.OnClickListener { dialog, whichButton ->
            dialog.dismiss()
        })
        val b = dialogBuilder.create()
        b.show()
    }
}

