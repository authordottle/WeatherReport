package com.example.android.weatherreport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    TextView weather_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weather_data=(TextView)findViewById(R.id.weather_data_layout);
        String[] data={
                "Today Sunny",
                "Tmr Cloudy",
                "Today Sunny",
                "Tmr Cloudy",
                "Today Sunny",
                "Tmr Cloudy",
                "Today Sunny",
                "Tmr Cloudy",
                "Today Sunny",
                "Tmr Cloudy",
                "Today Sunny",
                "Tmr Cloudy",
        };


        for (String everyday:data){
            weather_data.append(everyday+"\n");

        }
    }
}
