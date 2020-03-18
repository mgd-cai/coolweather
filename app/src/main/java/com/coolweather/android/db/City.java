package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2020/3/19.
 */

public class City extends DataSupport {

    private int id;  //id
    private String cityName;  //城市名称
    private int cityCode;  //城市代码
    private int provinceId;  //城市所属省份的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
