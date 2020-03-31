package com.JavaPractice.Session1;

public class Practice0109 {
    /*
    متدی بنویسید که آرایه ای دو بعدی از int را دریافت میکند دریافت میکند و بزرگترین عنصر آن آرایه را بر میگرداند
    create a method that receives a two-dimensional array of int, and returns the largest element of that array
     */

    public  static void  main (String [] args)
    {
        int [] [] Numbers= new int [] [] {{1,10,5,150,23,66,65,10},{99,100,51,65,15,200,69,33}};
        System.out.println("The Max is:"+ReturnMAX(Numbers));
    }

    static int ReturnMAX (int [] [] Numb)
    {
        int max = 0;
        for (int i=0;i<Numb.length;i++)
        {
            for (int j = 0 ; j<Numb[i].length;j++)
            {
                if (max < Numb[i][j])
                    max=Numb[i][j];
            }
        }
        return max;
    }
}
//https://github.com/AhmadR3zA1911/JavaExercise
