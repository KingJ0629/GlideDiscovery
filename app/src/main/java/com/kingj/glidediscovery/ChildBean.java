package com.kingj.glidediscovery;

import android.annotation.TargetApi;
import android.os.Build;

/**
 * Created by Jin on 2018/3/13.
 * Description
 */
public class ChildBean implements Cloneable {
	
	private String name;
	
	public ChildBean(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@TargetApi(Build.VERSION_CODES.N)
	@Override
	public ChildBean clone() {
		try {
			return (ChildBean) super.clone();
		} catch (CloneNotSupportedException e) {
			// this shouldn't happen, since we are Cloneable
			throw new InternalError(e);
		}
	}
}
