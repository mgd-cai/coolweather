package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2020/3/19.
 */

public class Province extends DataSupport {

    private int id;  //每个实体类都应有的id
    private String provinceName;  //省份名称
    private int provinceCode;  //省份代码

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
