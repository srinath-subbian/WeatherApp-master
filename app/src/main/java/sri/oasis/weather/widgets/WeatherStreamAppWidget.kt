package sri.oasis.weather.widgets

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.RemoteViews
import sri.oasis.weather.R

import sri.oasis.weather.activity.SplashActivity
import sri.oasis.weather.model.WeatherData
import sri.oasis.weather.services.WeatherWidgetService



class WeatherStreamAppWidget : AppWidgetProvider() {

    override fun onUpdate(context: Context?, appWidgetManager: AppWidgetManager?, appWidgetIds: IntArray?) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)
        updateAppWidget(context, appWidgetManager)
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        super.onReceive(context, intent)
        val appWidgetManager = AppWidgetManager.getInstance(context?.applicationContext)
        if (appWidgetManager != null) {
            updateAppWidget(context, appWidgetManager)
        }
    }

    /***
     * Method for update data of widget.
     * @param context: Context of app
     * @param appWidgetManager: Instance of AppWidgetManager
     *
     * */
    private fun updateAppWidget(context: Context?, appWidgetManager: AppWidgetManager?) {
        val thisWidget = ComponentName(context, WeatherStreamAppWidget::class.java)
        val allWidgetIds = appWidgetManager?.getAppWidgetIds(thisWidget)
        val remoteViews = RemoteViews(context?.packageName, R.layout.weather_forecasting_app_widget)
        val weatherData = WeatherData.getLocationBasedWeatherDetails()

        if (allWidgetIds != null && allWidgetIds.isNotEmpty()) {
            if (weatherData != null) {
                remoteViews.setViewVisibility(R.id.tvNoDataFound, View.GONE)
                val intent = Intent(context?.applicationContext, WeatherWidgetService::class.java)
                intent.action = AppWidgetManager.ACTION_APPWIDGET_UPDATE
                intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, allWidgetIds)

                context?.stopService(intent)
                context?.startService(intent)

            } else {
                remoteViews.setViewVisibility(R.id.tvNoDataFound, View.VISIBLE)
            }

            val splashIntent = Intent(context, SplashActivity::class.java)
            val pendingIntent = PendingIntent.getActivity(context, 0, splashIntent, 0)
            remoteViews.setOnClickPendingIntent(R.id.flwidgetParent, pendingIntent)

            for (widgetId in allWidgetIds) {
                appWidgetManager.updateAppWidget(widgetId, remoteViews)
            }
        }
    }

    override fun onDeleted(context: Context?, appWidgetIds: IntArray?) {
        super.onDeleted(context, appWidgetIds)

        val intent = Intent(context, WeatherWidgetService::class.java)
        context?.stopService(intent)
    }
}