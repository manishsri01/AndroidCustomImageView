package com.androidhub4you.crop;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	private ImageView imageViewRound;
	private ImageView imageViewOval;
	private ImageView imageViewTriangle;
	private ImageView imageViewHexaGon;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imageViewRound=(ImageView)findViewById(R.id.imageView_round);
		imageViewOval=(ImageView)findViewById(R.id.imageView_oval);
		imageViewTriangle=(ImageView)findViewById(R.id.imageView_triangle);
		imageViewHexaGon=(ImageView)findViewById(R.id.imageView_hexagon);
		
		Bitmap icon = BitmapFactory.decodeResource(getResources(),R.drawable.pic1);
		
		imageViewRound.setImageBitmap(icon);
		imageViewOval.setImageBitmap(icon);
		imageViewTriangle.setImageBitmap(icon);
		imageViewHexaGon.setImageBitmap(icon);
		
		
	}


	
}
