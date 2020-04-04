package com.JavaPractice.Session2;

public class Practice010City {

    private String name ;
    private String country;

    private double population;

    public Practice010City(String name, String country, double population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public boolean equals(Object obj )
    {
        if (this == obj)
        return true ;
        else
            return false;
    }
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", population=" + population +
                '}';
    }
}

