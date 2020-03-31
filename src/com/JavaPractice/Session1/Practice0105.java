package com.JavaPractice.Session1;

public class Practice0105 {
    /*
    متدی بنویسید که آرایهای از اعداد دریافت میکند و میانگین آنها را بصورت یک عدد double برمیگرداند
    Create a method that gets an array of numbers and returns its average as a double number
     */
    public static void  main (String [] args)
    {
        double [] num = new double [] {10,20,30,40,55,33,25,69,12,11,7};
        double Avrage = SumAvrage(num);
        System.out.println("AVG: "+Avrage);
    }

    static  double SumAvrage (double numbers[] )
    {
        double sum = 0;
        for (int i=0 ; i<numbers.length;i++)
        {
            sum+=numbers[i];
        }
        return  sum/numbers.length;
    }
}
//https://github.com/AhmadR3zA1911/JavaExercise
