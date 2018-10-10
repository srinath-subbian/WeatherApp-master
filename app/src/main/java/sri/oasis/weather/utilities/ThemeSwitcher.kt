package sri.oasis.weather.utilities

import android.app.Activity
import sri.oasis.weather.R

class ThemeSwitcher {
    companion object {
        private var sTheme: Int = 0
        /**
         * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
         */
        fun changeToTheme(activity: Activity, theme: Int) {
            sTheme = theme
            activity.recreate()
        }

        /** Set the theme of the activity, according to the configuration.  */
        fun onActivityCreateSetTheme(activity: Activity) {
            when (sTheme) {
                KeyUtil.THEME_DEFAULT -> {
                    activity.setTheme(R.style.AppTheme)
                }
                KeyUtil.THEME_NIGHT -> {
                    activity.setTheme(R.style.NightModeTheme)
                }
            }
        }
    }
}