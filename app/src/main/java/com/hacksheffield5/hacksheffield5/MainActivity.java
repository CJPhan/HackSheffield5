package com.hacksheffield5.hacksheffield5;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RelativeLayout main;
    Handler handler = new Handler();
    Toolbar nav_bar;
    TextView etSwipe;
    Button bSwipe;

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            main.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSwipe = (TextView) findViewById(R.id.etSwipe);
        main = (RelativeLayout) findViewById(R.id.main);
        nav_bar = (Toolbar) findViewById(R.id.nav_bar);
        bSwipe = (Button) findViewById(R.id.bSwipe);

        bSwipe.setOnClickListener(this);

        setSupportActionBar(nav_bar);

        handler.postDelayed(runnable, 2000);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bSwipe:
                startActivity(new Intent(this, SwipeActivity.class));
                break;
        }
    }
}
