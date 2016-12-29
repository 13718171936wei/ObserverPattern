package com.example;

import java.util.List;

/**
 * Created by 行走的力量 on 2016/12/29.
 */

public class ForecastDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private List<Float> forecastTemperatures;//未来几天的温度

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("未来几天的温度");
        int count = forecastTemperatures.size();
        for (int i = 0; i < count; i++) {
            System.out.println("第" + i + "天" + forecastTemperatures.get(i) + "C");
        }
    }

    @Override
    public void update() {
        this.forecastTemperatures = this.weatherData.getForecastTemperatures();
        display();
    }
}
