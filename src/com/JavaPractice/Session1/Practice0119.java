package com.JavaPractice.Session1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice0119 {
    /*
    متدی بنویسید که دو آرایه از رشته دریافت کند و آرایة ای تولید کند که هر عنصر آن مجموع
عناصر نظیر آن در هر دو آرایه باشد.

create a method to get two arrays from a string and generate an array whose sum of each element
Elements like that should be in both arrays.
     */

    public static void main (String [] args)
    {
        String [] str1 = new String[]{"He","Thi","Fir","Ja","str","Arr"};
        String [] str2 = new String[]{"llo","s is","st","va","ing","ay"};
        System.out.println("FirstArray="+ Arrays.toString(str1));
        System.out.println("SecondArray="+ Arrays.toString(str2));
        System.out.println("ConcatArray:"+ Arrays.toString(ConcatStrArray(str1,str2)));
    }

    static String [] ConcatStrArray (String [] First , String [] Second)
    {
        String [] newStr = new String[First.length];
        for (int i = 0 ; i< First.length ; i++)
        {
            newStr[i]=First[i]+Second[i];
        }
        return newStr;
    }
}
//https://github.com/AhmadR3zA1911/JavaExercise
