package com.JavaPractice.Session2;

public class Line {
    private double x;
    private double y;

    public Line (double x , double y)
    {
        this.x=x;
        this.y=y;
    }

    public void setX (double x)
    {
        this.x=x;
    }
    public double getX ()
    {
        return this.x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public boolean equils (Object obj)
    {
        Line line = (Line) obj;
        if(this.x==line.x && this.y==line.y)
            return true;
        else
            return false;
    }


    public String toString() {
        return "Line{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
