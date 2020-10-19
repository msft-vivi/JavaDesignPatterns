package Observer.before;

import Observer.before.DisplayPane.CurrentConditionsDisplay;
import Observer.before.DisplayPane.ForecastDisplay;
import Observer.before.DisplayPane.StatisticsDisplay;

/**
 * 问题：如果需要新增 HeatIndexDisplay 显示模块，则需要修改 WeatherData 类代码，不符合开闭原则
 * 这种最基础的设计，使得WeatherData 依赖具体的 xxxDisplay，而不符合 “依赖倒置” 原则中的
 * 应该依赖接口抽象（稳定），而不是依赖具体的实现（不稳定）
 */

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;
    private CurrentConditionsDisplay currentConditionsDisplay;
    private ForecastDisplay forecastDisplay;
    private StatisticsDisplay statisticsDisplay;

    public void measurementsChanged(){
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        // 以下代码不符合依赖倒置原则
        currentConditionsDisplay.update(temp,humidity,pressure);
        forecastDisplay.update(temp,humidity,pressure);
        statisticsDisplay.update(temp,humidity,pressure);
    }

    // 这里是 WeatherData 其他方法
    // ...

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
