package com.mia.ratingdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Toast;


public class MainActivity extends Activity
{
        RatingBar ratingBar;
        Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
   
    ratingBar=(RatingBar)findViewById(R.id.ratingBar1);
    btn=(Button)findViewById(R.id.button1);
    
    ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
        public void onRatingChanged(RatingBar ratingBar, float rating,
        boolean fromUser) {

        Toast.makeText(getApplicationContext(),"Your Selected Ratings  : " + String.valueOf(rating),Toast.LENGTH_LONG).show();
        
        }
        });
    
    btn.setOnClickListener(new View.OnClickListener() {
        
    	   
    	public void onClick(View arg0) {
    	// TODO Auto-generated method stub
    	float rating=ratingBar.getRating();
    	Toast.makeText(getApplicationContext(),"Your Selected Ratings  : " + String.valueOf(rating),Toast.LENGTH_LONG).show();
    	}
    	});
    }
}