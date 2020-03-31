package com.JavaPractice.Session1;

public class Practice0121 {
    /*
    در زیر داده های مختلفی تعریف شده اند، داده هایی را که به یکدیگر قابل تبدیل هستند را به
یکدیگر تبدیل کنید:
The following are different data sets to convert data that can be converted to one another
Convert one another:
int i = 4;
long j = 3 ;
float k = 23.0f ;
double d = 12.12 ;
char ch = 'c';
boolean b = false ;
     */

public static  void  main (String [] args) {
    int i = 4;
    long j = 3 ;
    float k = 23.0f ;
    double d = 12.12 ;
    char ch = 'c';
    boolean b = false ;
    j=i;
    i=(int)j;
    j=(long)k;
    k=j;
    d=k;
    k=(float)d;
    d=ch;
    i=ch;
    j=ch;
    k=ch;

}
}
