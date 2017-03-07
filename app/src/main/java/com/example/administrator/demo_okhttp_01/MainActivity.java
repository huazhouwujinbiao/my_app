package com.example.administrator.demo_okhttp_01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private TextView mtv;
    private Retrofit mRetrofit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtv= (TextView) findViewById(R.id.tv);

    }
}
