package com.JavaPractice.Session1;

public class Practice0107 {
    /*
        متدی بنویسید که آرایهای از اعداد را دریافت نموده و سپس عناصر آرایه را به صورت معکوس
درون آرایه قرار دهد.
 create a method to get an array of numbers and then invert the array elements into the array.
     */
    public  static  void main (String [] args)
    {
        int [] Nums = {1,2,3,4,5,6,7};
        for (int i=0 ; i<Nums.length; i++)
        {
            System.out.println("Org["+i+"]: "+Nums[i]);
        }
        System.out.println("------REVERSE-------");
        Nums = ReverseArray(Nums);
        for (int z=0 ; z<Nums.length; z++)
        {
            System.out.println("Rev["+z+"]: "+Nums[z]);
        }
    }

    static  int [] ReverseArray(int [] numbers)
    {
        int [] RevNums = new int[numbers.length];
        int count = 0;
        for (int i = numbers.length-1 ; i >= 0 ; i-- )
        {
            RevNums[count++]=numbers[i];
            //count++;

        }

        return RevNums;
    }
}
//https://github.com/AhmadR3zA1911/JavaExercise
