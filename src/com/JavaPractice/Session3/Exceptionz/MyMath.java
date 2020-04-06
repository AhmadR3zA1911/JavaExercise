package com.JavaPractice.Session3.Exceptionz;

public class MyMath {
    private double number1;
    private double number2;


    public MyMath(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {

        this.number2 = number2;
    }

    public double divided (Object obj) throws Exception {
        MyMath math = (MyMath) obj;
        if (math.number2==0) {
            Exception ex = new Exception("From Class:Divided Of Zero not Allow");
            throw ex;
        }
        else
        {
            return math.number1/math.number2;
        }


    }
}
