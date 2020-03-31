package com.JavaPractice.Session1;

public class Practice0111 {
    /*
    متدی بنویسید که یک آرایه از اعداد و یک عدد را دریافت کند، سپس با جستجو در آرایه، تعداد
    دفعاتی را که آن عدد در آرایه تکرار شده است را برگرداند.

    create a method to get an array of numbers and a number, then search the array to find
    Returns the number of times that number is repeated in the array.

     */

    public static void  main (String [] Args)
    {
        int [] Numbers = {10,10,56,9,55,6,3,3,10,2,3,4,99,0,8,6,11,10,3,4,6,5,4,55,66,99,88};
        int s = 10;
        System.out.println("The number of repetitions("+s+"): "+SearchNumber(Numbers,s));
    }

    static int SearchNumber (int [] Nums , int n)
    {
        int count = 0 ;
        for (int i = 0 ; i<Nums.length ; i ++)
        {
            if (Nums[i]==n)
                count++;
        }
        return count;
    }
}

//https://github.com/AhmadR3zA1911/JavaExercise

