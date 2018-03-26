package com.kingj.glidediscovery;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Jin on 2018/3/26.
 * Description
 */
public class TestService extends IntentService {
	
	/**
	 * Creates an IntentService.  Invoked by your subclass's constructor.
	 *
	 */
	public TestService() {
		super("TestService");
	}
	
	@Override
	protected void onHandleIntent(@Nullable Intent intent) {
		Log.i("msg", "TestService:" + Thread.currentThread().getName());
	}
}
