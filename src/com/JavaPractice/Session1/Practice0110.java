package com.JavaPractice.Session1;

public class Practice0110 {
    /*
    متدی بنویسید که آرایه ای دوبعدی از int را  دریافت میکند و میانگین عناصر آنرا برمیگرداند
    create a method that gets a two-dimensional array of int and returns the mean of its elements
     */

    public static void  main (String [] args)
    {
        int [] [] Numbers = {{10,10},{7,17}};
        System.out.println("AVG is :"+ ReturnAvrage(Numbers));
    }
    static  double ReturnAvrage (int [] [] numbs)
    {
        double sum=0;
        int count=0; // for counting all numbers
        for (int i=0 ; i<numbs.length;i++)
        {
            for (int j=0 ;j<numbs[i].length ; j++)
            {
                sum+=numbs[i][j];
                count++;
            }
        }
        return  sum/count;
    }
}
//https://github.com/AhmadR3zA1911/JavaExercise
