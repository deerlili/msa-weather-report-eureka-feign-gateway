package com.deerlili.spring.cloud.weather.service;

import com.deerlili.spring.cloud.weather.entity.City;
import com.deerlili.spring.cloud.weather.entity.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("msa-weather-eureka-client-zuul") // API网关的地址
public interface DataClient {
    /**
     * 获取城市列表
     * @return
     * @throws Exception
     */
    @GetMapping("/city/cities") //申明资源的位置
    List<City> cityList() throws Exception;

    /**
     * 根据城市ID获取城市天气数据
     * @param cityId
     * @return
     */
    @GetMapping("/data/weather/cityId/{cityId}") //申明资源的位置
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);
}
