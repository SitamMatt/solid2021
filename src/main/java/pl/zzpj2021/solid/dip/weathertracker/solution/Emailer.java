package pl.zzpj2021.solid.dip.weathertracker.solution;


public class Emailer extends AbstractEmailer {

    @Override
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
