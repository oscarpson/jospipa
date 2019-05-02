package com.joslabs.jospipa;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.joslabs.jospipa.UI.ProductJavaActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
@BindView(R.id.carda)
    CardView cardGarbage;
@BindView(R.id.btnlogin)
Button btnLogin;
@BindView(R.id.btn_login_regiter)
Button btnRegister;
@BindView(R.id.cardg)
CardView cardMessage;
@BindView(R.id.cardprofile)
CardView cardProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        cardGarbage.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        cardMessage.setOnClickListener(this);
        cardProfile.setOnClickListener(this);
       // Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.carda:
                startActivity(new Intent(getApplicationContext(),GasPoint.class));
                break;

            case R.id.btnlogin:

                break;
            case R.id.btn_login_regiter:
                startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
                break;
            case R.id.cardg:
                startActivity(new Intent(getApplicationContext(),MessageActivity.class));
                break;
            case R.id.cardprofile:
                startActivity(new Intent(getApplicationContext(), ProductJavaActivity.class));
                break;
        }
    }
}
