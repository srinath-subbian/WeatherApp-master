package sri.oasis.weather

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.support.v7.app.AppCompatDelegate
import com.crashlytics.android.Crashlytics
import sri.oasis.weather.utilities.PreferenceUtil
import com.raizlabs.android.dbflow.config.FlowConfig
import com.raizlabs.android.dbflow.config.FlowManager
import io.fabric.sdk.android.Fabric



class WeatherStreamApp: Application() {
    lateinit var preferenceUtil: PreferenceUtil

    override fun onCreate() {
        super.onCreate()

        // This instantiates DBFlow
        FlowManager.init(FlowConfig.Builder(this).build())

        // Make sure we use vector drawables
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)

        Fabric.with(this, Crashlytics())
        registerActivityLifecycleCallbacks(activityLifecycleCallbacks)
    }

    override fun onTerminate() {
        super.onTerminate()
        FlowManager.destroy()
        unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks)
    }

    private var activityLifecycleCallbacks: Application.ActivityLifecycleCallbacks = object : Application.ActivityLifecycleCallbacks {
        override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {}

        override fun onActivityStarted(activity: Activity?) {
        }

        override fun onActivityResumed(activity: Activity?) {
        }

        override fun onActivityPaused(activity: Activity?) {}

        override fun onActivityStopped(activity: Activity?) {}

        override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {}

        override fun onActivityDestroyed(activity: Activity?) {}
    }
}