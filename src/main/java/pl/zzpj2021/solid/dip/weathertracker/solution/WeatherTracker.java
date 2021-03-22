package pl.zzpj2021.solid.dip.weathertracker.solution;


import java.util.Objects;

public class WeatherTracker {
    String currentConditions;
    AbstractPhone phone;
    AbstractEmailer emailer;

    public WeatherTracker(AbstractPhone phone, AbstractEmailer emailer) {
        this.phone = phone;
        this.emailer = emailer;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (Objects.equals(weatherDescription, "rainy")) {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (Objects.equals(weatherDescription, "sunny")) {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
