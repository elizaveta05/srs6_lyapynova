package com.example.srs6_lyapynova;
public class Weather {
    private String date;
    private final String maxtemp_c;
    private final String url;

    public Weather(String date, String maxtemp_c, String url) {
        this.date=date;
        this.maxtemp_c=maxtemp_c;
        this.url=url;
    }

    public String GetDate() {
        return this.date;
    }

    public void SetDate(String date) {
        this.date = date;
    }

    public String GetUrl() {
        return this.url;
    }

    public String GetTemp() {
        return this.maxtemp_c;
    }
}



