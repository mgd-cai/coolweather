package com.coolweather.android.gson;

/**
 * Created by lenovo on 2020/3/19.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;
        public String pm25;
    }
}
