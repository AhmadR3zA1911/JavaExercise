package com.JavaPractice.Session2;

public class Practice01Date {
    private int day;
    private  int month;
    private int year ;

    public Practice01Date(int day)
    {
        this(day,0,0);
    }

    public Practice01Date(int day , int month , int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
