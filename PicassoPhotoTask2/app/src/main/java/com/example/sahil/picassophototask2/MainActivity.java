package com.example.sahil.picassophototask2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.main_image_view);
        final String url = "https://qnaxapi.herokuapp.com/memes";
        Picasso.with(this).load(url).into(imageView);
    }
}
