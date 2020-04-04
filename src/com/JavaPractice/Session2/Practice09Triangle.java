package com.JavaPractice.Session2;

public class Practice09Triangle {
    private int x ;
    private int y;
    private int z;

    public Practice09Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public boolean isTriangle (Object obj)
    {
        Practice09Triangle triangle = (Practice09Triangle) obj;
        if ((triangle.x+triangle.y)>triangle.z && (triangle.x+triangle.z)>triangle.y && (triangle.y+triangle.z) > triangle.x )
            return true;
        else
            return false;


    }

    public boolean equals (Object obj)
    {
        Practice09Triangle triangle = (Practice09Triangle) obj;
        if (this.x==triangle.x && this.y==triangle.y && this.z==triangle.z)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
