package com.JavaPractice.Session2;

public class Practice02Weather {
    private  int currentTemp;
    private  int maxTempLast24;
    private  int minTempLast24;
    private  int humidity; //میزان رطوبت

    public Practice02Weather(int currentTemp, int maxTempLast24, int minTempLast24, int humidity) {
        this.currentTemp = currentTemp;
        this.maxTempLast24 = maxTempLast24;
        this.minTempLast24 = minTempLast24;
        this.humidity = humidity;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public void setMaxTempLast24(int maxTempLast24) {
        this.maxTempLast24 = maxTempLast24;
    }

    public void setMinTempLast24(int minTempLast24) {
        this.minTempLast24 = minTempLast24;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public int getMaxTempLast24() {
        return maxTempLast24;
    }

    public int getMinTempLast24() {
        return minTempLast24;
    }

    public int getHumidity() {
        return humidity;
    }

    public boolean equals (Object obj)
    {
        Practice02Weather weather = (Practice02Weather) obj;
        if (this.currentTemp==weather.currentTemp)
            return true;
        else
            return false;

    }

    public String toString ()
    {
        return "CurrentTime:"+this.currentTemp+"\n"+"MaxLast24:"+this.maxTempLast24+"\n"+"MinLast24"+this.minTempLast24+
                "Humidity"+this.humidity;
    }
}
