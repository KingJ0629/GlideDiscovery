package com.kingj.glidediscovery;

import android.annotation.TargetApi;
import android.os.Build;

/**
 * Created by Jin on 2018/3/13.
 * Description
 */
public class ParentBean implements Cloneable {
	
	private ChildBean child;
	
	public ParentBean(ChildBean child) {
		this.child = child;
	}
	
	public ChildBean getChild() {
		return child;
	}
	
	public void setChild(ChildBean child) {
		this.child = child;
	}
	
	@TargetApi(Build.VERSION_CODES.N)
	@Override
	public ParentBean clone() {
		try {
			ParentBean parent = (ParentBean) super.clone();
			parent.setChild(this.getChild().clone());
			return parent;
		} catch (CloneNotSupportedException e) {
			// this shouldn't happen, since we are Cloneable
			throw new InternalError(e);
		}
	}
}
