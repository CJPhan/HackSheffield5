package com.hacksheffield5.hacksheffield5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    RelativeLayout login_form;
    Handler handler = new Handler();
    Button bSignIn;
    EditText etEmail, etPassword;
    TextView registerLink;

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            login_form.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_form = (RelativeLayout) findViewById(R.id.login_form);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bSignIn = (Button) findViewById(R.id.bSignIn);
        registerLink = (TextView) findViewById(R.id.registerLink);

        bSignIn.setOnClickListener(this);
        registerLink.setOnClickListener(this);

        handler.postDelayed(runnable, 2000);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.bSignIn:
                startActivity(new Intent(this, MainActivity.class));
                break;
            /* case R.id.registerLink:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
                */
        }
    }
}
