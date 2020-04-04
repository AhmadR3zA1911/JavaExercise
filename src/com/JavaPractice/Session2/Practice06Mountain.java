package com.JavaPractice.Session2;

public class Practice06Mountain {
    private double Elevation ;//ارتفاع قله
    private int Temperature;
    private String Location ;

    public Practice06Mountain(double elevation, int temperature, String location) {
        Elevation = elevation;
        Temperature = temperature;
        Location = location;
    }

    public void setElevation(double elevation) {
        Elevation = elevation;
    }

    public void setTemperature(int temperature) {
        Temperature = temperature;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public boolean equals(Object obj)
    {
        Practice06Mountain mountain = (Practice06Mountain) obj;
        if (mountain.Elevation==this.Elevation)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString() {
        return "Mountain{" +
                "Elevation=" + Elevation +
                ", Temperature=" + Temperature +
                ", Location='" + Location + '\'' +
                '}';
    }
}
