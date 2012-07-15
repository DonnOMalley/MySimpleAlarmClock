package omalleyland.my.simple.tools;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class NextAlarm extends AppWidgetProvider {

	public static String REFRESH = "omalley.simplealarmclock.REFRESH";
	public static String ACTION_WIDGET_CONFIGURE = "ConfigureWidget";
		
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {	
		Log.e("SimpleAlarmClock", "OnUpdate....Doing Nothing");
        // Create an Intent to launch UpdateService
        Intent intent = new Intent(context, UpdateService.class);
		context.startService(intent);
    }

	@Override
	public void onDeleted(Context context, int[] appWidgetId) {
		Log.e("SimpleAlarmClock", "Deleting....");
        context.stopService(new Intent(context,UpdateService.class));
        super.onDeleted(context, appWidgetId);
	}

}
