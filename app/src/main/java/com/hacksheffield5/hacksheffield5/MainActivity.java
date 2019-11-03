package com.hacksheffield5.hacksheffield5;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button bSignOut;
    Toolbar nav_bar;
    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bSignOut = (Button) findViewById(R.id.bSignOut);
        nav_bar = (Toolbar) findViewById(R.id.nav_bar);

        bSignOut.setOnClickListener(this);
        setSupportActionBar(nav_bar);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bSignOut:
                startActivity(new Intent(this, LoginActivity.class));
                break;
        }
    }
    */
}
