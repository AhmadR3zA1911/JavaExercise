package com.JavaPractice.Session1;

public class Practice0113 {

    /*
    متدی بنویسید که یک عدد دریافت کند در صورتی که باقیمانده آن بر 5
عدد صفر باشد، رشته "Zero
    ONE یک باشد رشته
    TWO دو باشد رشته
سه باشد رشته Three
    Four چهار باشد رشته
را به عنوان خروجی برگرداند.

create a method to get a int  number if the Divide remaining  5
The number is zero, the string "Zero
1 Be a string "ONE"
2 be strings "TWO"
3 be strings "Three"
4 be a string "Four"
Return as output.

     */

    public  static void main (String [] args)
    {
        int num = 100;
        System.out.println("Result:"+DivideRemaining(num));
    }

    static  String  DivideRemaining (int num)
    {
        String result="";
        int Sum = num%5;
        switch (Sum)
        {
            case  0:
                result ="Zero";
                break;
            case 1:
                result="One";
                break;
            case 2:
                result="Two";
                break;
            case 3:
                result="Three";
                break;
            case 4:
                result = "Four";
                break;
            default:
                result="Out Of Range";



        }
        return  result;
    }
}
//https://github.com/AhmadR3zA1911/JavaExercise
