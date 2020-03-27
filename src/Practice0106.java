public class Practice0106 {
    /*
    آرایهای از اعداد بسازید و عناصر آنرا با اعداد دلخواه خود مقدار دهی کنید. در پایان به اندازه مقدارعددی هر کدام از عناصر آرایه، یک Progress bar در خروجی استاندارد بسازید.
     مثلا اگر عدد 5 باشد پنج ستاره در خروجی چاپ کنید:
*****
---------
create arrays of numbers and multiply elements by your own numbers. At the end, create a Progress bar at the standard output,
 as many as each array element. For example, if the number is 5, print five stars at the output: *****
     */
    public  static  void  main (String [] args)
    {
        int [] Stars = new int [] {1,2,3,4,5,6,7,8,9,10};
        for (int i =0 ; i<Stars.length; i++)
        {
            for (int j=0 ; j<Stars[i];j++)
            {
                System.out.print("*"); // Don't go to the next line
            }
            System.out.print("\n"); // Insert a newline in the text at this point
        }
    }
}
//https://github.com/AhmadR3zA1911/JavaExercise
