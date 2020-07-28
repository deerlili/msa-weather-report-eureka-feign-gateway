package com.deerlili.spring.cloud.weather.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Forecast implements Serializable{

    private static final long serialVersionUID = 1L;

    private String date; //日期
    private String high; //最高温
    private String fengli; //风力
    private String low; //最低温
    private String fengxiang; //风向
    private String type; //天气类型

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getFengli() {
        return fengli;
    }

    public void setFengli(String fengli) {
        this.fengli = fengli;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getFengxiang() {
        return fengxiang;
    }

    public void setFengxiang(String fengxiang) {
        this.fengxiang = fengxiang;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
