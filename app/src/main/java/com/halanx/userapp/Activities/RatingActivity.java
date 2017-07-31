package com.halanx.userapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.halanx.userapp.R;


public class RatingActivity extends AppCompatActivity {

    RatingBar rb;
    TextView tvRating;
    Boolean isRated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        rb = (RatingBar) findViewById(R.id.rb_rating);
        tvRating = (TextView) findViewById(R.id.tv_num_stars);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if (b) {
                    isRated = true;
                }

//                Toast.makeText(RatingActivity.this, "Rating is "+ v, Toast.LENGTH_SHORT).show();
//                tvRating.setText(""+v+" "+b);

                if (v == 1.0) {
                    tvRating.setText("1 star");
                } else if (v == 2.0) {
                    tvRating.setText("2 stars");
                } else if (v == 3.0) {
                    tvRating.setText("3 stars");
                } else if (v == 4.0) {
                    tvRating.setText("4 stars");
                } else if (v == 5.0) {
                    tvRating.setText("5 stars");
                }


            }
        });


        (findViewById(R.id.btn_submit)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isRated){
                Toast.makeText(RatingActivity.this, "Thank you for your feedback", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RatingActivity.this,HomeActivity.class));
                finish();}
                else {
                    Toast.makeText(RatingActivity.this, "Please rate your shopper", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
