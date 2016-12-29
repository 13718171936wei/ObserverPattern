package com.example;

import java.util.*;
import java.util.Observer;

/**
 * Created by 行走的力量 on 2016/12/29.
 */

public class ObserverPatternTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        List<Float> forecasttemperatures = new ArrayList<>();
        forecasttemperatures.add(22f);
        forecasttemperatures.add(-1f);
        forecasttemperatures.add(9f);
        forecasttemperatures.add(23f);
        forecasttemperatures.add(27f);
        forecasttemperatures.add(30f);
        forecasttemperatures.add(10f);
        weatherData.setMeasurements(22f, 0.8f, 1.2f, forecasttemperatures);
    }
}
