package com.JavaPractice.Session3.Exceptionz;

public class UseMyMath {
    public static void  main (String [] args)
    {
        MyMath math = new MyMath(10,0);
        try {
            System.out.println("Divided "+math.getNumber1()+"/"+math.getNumber2()+"="+math.divided(math));
        }
        catch (Exception ex)
        {
            System.out.println("Divided Of Zero not Allow");
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Finally");
        }
    }
}
