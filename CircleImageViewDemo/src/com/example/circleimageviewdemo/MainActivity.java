package com.example.circleimageviewdemo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;

public class MainActivity extends Activity {
	CircleImageViewUtil circle_imageview ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_circle_image_view);
		circle_imageview = (CircleImageViewUtil) findViewById(R.id.circle_imageview);
	
		circle_imageview.setImageResource(R.drawable.guide3);
		//circle_imageview.setImageBitmap(bm);
		//circle_imageview.setImageDrawable(drawable)
		/*Uri uri = new Uri("");
		circle_imageview.setImageURI(uri);*/
		
	

	}

	

}
