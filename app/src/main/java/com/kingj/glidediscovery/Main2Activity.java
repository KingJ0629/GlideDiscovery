package com.kingj.glidediscovery;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.Arrays;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
	
	String[] imgs = {
			"http://img.zcool.cn/community/01690955496f930000019ae92f3a4e.jpg@2o.jpg",
			"http://img0.imgtn.bdimg.com/it/u=1983968240,1065183412&fm=27&gp=0.jpg",
			"http://img0.imgtn.bdimg.com/it/u=889120611,3801177793&fm=27&gp=0.jpg",
			"http://img4.imgtn.bdimg.com/it/u=122378782,224856546&fm=27&gp=0.jpg",
			"http://img2.imgtn.bdimg.com/it/u=2704377591,355000919&fm=27&gp=0.jpg",
			"http://img2.imgtn.bdimg.com/it/u=4153290635,3572718379&fm=27&gp=0.jpg",
			"http://img5.imgtn.bdimg.com/it/u=3142081627,4151929064&fm=27&gp=0.jpg",
			"http://img0.imgtn.bdimg.com/it/u=2426407509,4199842435&fm=27&gp=0.jpg",
			"http://img3.imgtn.bdimg.com/it/u=2678268270,2482234645&fm=27&gp=0.jpg",
			"http://img1.imgtn.bdimg.com/it/u=1794894692,1423685501&fm=27&gp=0.jpg",
			"http://img3.imgtn.bdimg.com/it/u=1941269544,4205169439&fm=27&gp=0.jpg",
			"http://img1.imgtn.bdimg.com/it/u=3567283199,3430977696&fm=27&gp=0.jpg",
			"http://img3.imgtn.bdimg.com/it/u=3070159096,1298824329&fm=27&gp=0.jpg",
			"http://img3.imgtn.bdimg.com/it/u=3820216882,367330475&fm=27&gp=0.jpg",
			"http://img2.imgtn.bdimg.com/it/u=2936881590,490535990&fm=27&gp=0.jpg",
			"http://img5.imgtn.bdimg.com/it/u=251161048,2956789207&fm=27&gp=0.jpg",
			"http://img5.imgtn.bdimg.com/it/u=3895380214,1877236727&fm=27&gp=0.jpg",
			"http://img3.imgtn.bdimg.com/it/u=3033257042,4077893909&fm=27&gp=0.jpg",
			"http://img3.imgtn.bdimg.com/it/u=840710431,2758371038&fm=27&gp=0.jpg",
			"http://img5.imgtn.bdimg.com/it/u=1747088621,256464918&fm=27&gp=0.jpg",
			"http://img3.imgtn.bdimg.com/it/u=185075504,3651271933&fm=27&gp=0.jpg",
			"http://img1.imgtn.bdimg.com/it/u=3293842903,1040789920&fm=27&gp=0.jpg",
			"http://img2.imgtn.bdimg.com/it/u=2206398618,2984650698&fm=27&gp=0.jpg",
			"http://img2.imgtn.bdimg.com/it/u=3556326025,2943004307&fm=27&gp=0.jpg",
			"http://img3.imgtn.bdimg.com/it/u=3152217596,1256270477&fm=27&gp=0.jpg",
			"http://img2.imgtn.bdimg.com/it/u=2760227068,2010392660&fm=27&gp=0.jpg",
			"http://img3.imgtn.bdimg.com/it/u=2159853764,990011281&fm=27&gp=0.jpg",
			"http://img2.imgtn.bdimg.com/it/u=3965656371,3751907427&fm=27&gp=0.jpg",
			"http://img3.imgtn.bdimg.com/it/u=147015573,3182587356&fm=27&gp=0.jpg",
			"http://img5.imgtn.bdimg.com/it/u=4054007864,2464688467&fm=27&gp=0.jpg",
			"http://img1.imgtn.bdimg.com/it/u=3433538681,1381870254&fm=27&gp=0.jpg",
			"http://img5.imgtn.bdimg.com/it/u=415293130,2419074865&fm=27&gp=0.jpg",
	};
	
	RecyclerView mRecyclerView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mRecyclerView = findViewById(R.id.recycler);
		mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
		List<String> list = Arrays.asList(imgs);
		
		RecycleCommonAdapter mAdapter = new RecycleCommonAdapter<String>(this, list, R.layout.img2) {
			@Override
			public void convert(RecycleCommonViewHolder helper, String item, int position) {
				Uri uri = Uri.parse(item);
				SimpleDraweeView draweeView = helper.getView(R.id.img);
				draweeView.setImageURI(uri);
			}
		};
		mRecyclerView.setAdapter(mAdapter);
	}
	
}
