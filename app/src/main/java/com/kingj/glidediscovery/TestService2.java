package com.kingj.glidediscovery;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Jin on 2018/3/26.
 * Description
 */
public class TestService2 extends Service {
	
	@Nullable
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Log.i("msg", "TestService2:" + Thread.currentThread().getName());
		return super.onStartCommand(intent, flags, startId);
	}
	
	
}
