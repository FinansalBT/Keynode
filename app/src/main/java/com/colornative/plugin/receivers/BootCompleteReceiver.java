package com.colornative.plugin.receivers;

import com.colornative.plugin.lock.AppLockService;
import com.colornative.plugin.util.PrefUtils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.colornative.plugin.R;

/**
 * Starts the Service at boot if it's specified in the preferences.
 * 
 * @author colornative
 * 
 */
public class BootCompleteReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context c, Intent i) {
		Log.d("BootCompleteReceiver", "bootcomplete recevied");

		boolean start = new PrefUtils(c).getBoolean(
				R.string.pref_key_start_boot, R.bool.pref_def_start_boot);
		if (start) {
			Log.d("BootCompleteReceiver", "Starting service");
			AppLockService.start(c);
		}
	}

}
