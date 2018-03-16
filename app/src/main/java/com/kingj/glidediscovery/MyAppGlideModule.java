package com.kingj.glidediscovery;

import android.content.Context;
import android.support.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.cache.ExternalPreferredCacheDiskCacheFactory;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;

import java.io.InputStream;

/**
 * Created by Jin on 2018/2/8.
 * Description
 */
@GlideModule
public final class MyAppGlideModule extends AppGlideModule {
	@Override
	public void applyOptions(Context context, GlideBuilder builder) {
		builder.setDiskCache(new ExternalPreferredCacheDiskCacheFactory(context));
		builder.setDefaultRequestOptions(RequestOptions.formatOf(DecodeFormat.PREFER_ARGB_8888));
		super.applyOptions(context, builder);
	}
	
	@Override
	public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
		glide.getRegistry().append(GlideUrl.class, InputStream.class, new HttpGlideUrlLoader.Factory());
	}
}
