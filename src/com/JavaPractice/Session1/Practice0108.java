package com.JavaPractice.Session1;

public class Practice0108 {
    /*
    متدی بنویسید که یک آرایه دوبعدی ازint را دریافت میکند و مقادیر آنرا در خروجی استاندارد چاپ کند
    ز create a method that receives a two-dimensional array of int and prints its values in standard output
     */
    public static void main(String[] args) {

        int [] [] Numbers = new int [] [] {{1,2,3,4},{10,20,30,40,50,60},{88,77}};
        Print2DArray(Numbers);
    }

    static void Print2DArray (int num [][])
    {
        for (int i=0 ; i<num.length;i++)
        {
//            System.out.print("Number"+"["+i+"]"+"["+j+"]:");
            for (int j = 0 ; j<num[i].length;j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
//https://github.com/AhmadR3zA1911/JavaExercise
