package com.JavaPractice.Session2;

public class Practice011Country {

    private String name;
    private String continent; //قاره
    private double population; //جمعیت
    private String currency;

    public Practice011Country(String name, String continent, double population, String currency) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public double getPopulation() {
        return population;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean equals (Object obj)
    {
        Practice011Country country = (Practice011Country) obj;
        if (this.population==country.population && this.continent==country.continent)
            return true;
        else
            return false;
    }


    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                ", currency='" + currency + '\'' +
                '}';
    }
}
