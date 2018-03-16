package com.kingj.glidediscovery;

import android.app.Fragment;
import android.util.Log;

/**
 * Created by Jin on 2018/2/8.
 * Description
 */
public class GoneFragment extends Fragment {
	
	@Override
	public void onStart() {
		super.onStart();
		
		Log.i("msg", "fragment onStart");
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
		Log.i("msg", "fragment onDestroy");
	}
}
