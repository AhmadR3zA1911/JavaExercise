package com.JavaPractice.Session1;

public class Practice0120 {
    /*
    در کلاس زیر مکانهایی را که خطای کامپایل دارند پیدا کنید:
    Find the places that have compile error in the following class:.
     */
    int j = 0;
    int i = 2;

    public int getValue(int j) {
     //   int j = 12; //Error:(10, 13) java: variable j is already defined in method getValue(int)
        return j;
    }

    public void printValue() {
        int j = 12;
        System.out.println(j);
    }

    public void calculate(int j) {
        if (j == i) {
            int i = 12;
            System.out.println(i + j);
        }
    }

    public int convert(char c) {
        return c;
    }

    public float convert(double d) {
    //    return d; // Error:(31, 16) java: incompatible types: possible lossy conversion from double to float
        return 0;
    }

    public double convert(float d) {
        return d;
    }

    public int convert(short s) {
        return s;
    }

    public int convert(long k) {
   //     return k; //Error:(43, 16) java: incompatible types: possible lossy conversion from long to int
        return 0;
    }

    public static void main(String[] args) {

    }

}

//https://github.com/AhmadR3zA1911/JavaExercise
