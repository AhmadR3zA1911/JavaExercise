package com.JavaPractice.Session1;

public class Practice0104 {
/*
آرایهای 5 تایی از رشته بسازید و مقادیر پیشفرض آنرا در خروجی استاندارد چاپ کنید.
نکته: وقتی آرایهای از آبجکت میسازید مقادیر پیش فرض تمام آنها null است
create 5 variable from the string array and print the default values to the standard output.
Note: When you create arrays from an object the default values are all null

 */
    public  static  void main (String [] args)
    {
        String [] NoValue = new String[5];
        for (int i =0 ; i<NoValue.length;i++)
        {
            System.out.println("Valu "+i+":"+NoValue[i]);
        }
    }
}
//https://github.com/AhmadR3zA1911/JavaExercise
