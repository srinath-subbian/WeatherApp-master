package sri.oasis.weather.utilities

import android.content.Context
import sri.oasis.weather.MainActivity



class PreferenceUtil(private val mActivity: MainActivity) {

    private val PREFERENCE_ID = "WEATHERSTREAM"

    // Notification switch
    val IS_NOTIFICATION_ON = "IS_NOTIFICATION_ON"
    val IS_TEMPERATURE_UNIT_CELCIUS = "IS_TEMPERATURE_UNIT_CELCIUS"
    val IS_SPEED_UNIT_METERS = "IS_SPEED_UNIT_METERS"
    var IS_AIR_PRESSURE_HPA = "IS_AIR_PRESSURE_HPA"
    var IS_APP_THEME_DAY = "IS_APP_THEME_DAY"

    fun getPref(mPrefKey: String): String {
        try {
            val prefs = mActivity.getSharedPreferences(PREFERENCE_ID, Context.MODE_PRIVATE)
            return prefs.getString(mPrefKey, "")
        } catch (e: Exception) {
            e.printStackTrace()
            return ""
        }

    }

    fun setPref(mPrefKey: String, mPrefValue: String?) {
        try {
            val editor = mActivity.getSharedPreferences(PREFERENCE_ID, Context.MODE_PRIVATE).edit()
            if (mPrefValue != null) {
                editor.remove(mPrefKey)
                editor.putString(mPrefKey, mPrefValue)
            } else {
                editor.remove(mPrefKey)
                editor.putString(mPrefKey, "")
            }
            editor.apply()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getBooleanPref(mPrefKey: String): Boolean {
        try {
            val prefs = mActivity.getSharedPreferences(PREFERENCE_ID, Context.MODE_PRIVATE)
            return if (mPrefKey == IS_NOTIFICATION_ON || mPrefKey == IS_TEMPERATURE_UNIT_CELCIUS || mPrefKey == IS_SPEED_UNIT_METERS
                           || mPrefKey == IS_AIR_PRESSURE_HPA || mPrefKey == IS_APP_THEME_DAY) {
                prefs.getBoolean(mPrefKey, true)
            } else {
                prefs.getBoolean(mPrefKey, false)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            return false
        }
    }

    fun setBooleanPref(mPrefKey: String, mPrefValue: Boolean) {
        try {
            val editor = mActivity.getSharedPreferences(PREFERENCE_ID, Context.MODE_PRIVATE).edit()
            editor.remove(mPrefKey)
            editor.putBoolean(mPrefKey, mPrefValue)
            editor.apply()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
}
