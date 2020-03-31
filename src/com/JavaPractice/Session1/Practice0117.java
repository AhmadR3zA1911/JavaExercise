package com.JavaPractice.Session1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice0117 {
    /*
    متدی بنویسید که دو آرایه از اعداد را دریافت کند سپس حاصلضرب دو آرایه را برگرداند
    create a method to get two arrays of numbers then return the product of two arrays
     */

    public static void main (String [] args)
    {
        int [] Numbers1 = {10,20,30,40};
        int [] Numbers2 = {2,4,6,8};
        System.out.println("Array1: "+ Arrays.toString(Numbers1));
        System.out.println("Array2: "+ Arrays.toString(Numbers2));
        System.out.println("Array1*Array2="+Arrays.toString(MultiplyCorrespondingArrays(Numbers1,Numbers2)));
    }

    static int [] MultiplyCorrespondingArrays (int [] L_Array  , int [] R_Array)
    {
        int [] Sum = new int [L_Array.length];

        for (int i = 0 ; i< L_Array.length ; i++)
        {
            Sum[i]=L_Array[i]*R_Array[i];
        }
        return Sum;
    }

}
//https://github.com/AhmadR3zA1911/JavaExercise


