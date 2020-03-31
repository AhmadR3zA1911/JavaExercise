package com.JavaPractice.Session2;

public class Rational {
    private int head ;
    private  int tail;

    Rational (int h,int t)
    {
        head=h;
        tail=t;
    }
    public void SetHead (int h)
    {
        head = h;
    }
    public int GetHead()
    {
        return head;
    }
    public  void Settail (int t)
    {
        tail=(t!=0? t : 1);
    }

    public  int Gettail()
    {
        return tail;
    }

    public boolean equals (Object obj)
    {
        Rational r = (Rational) obj;
        if((head*r.tail) == (r.head*tail))
            return true;
        else
            return  false;

    }

    public String toString ()
    {
        return  head+"/"+tail;
    }

}
