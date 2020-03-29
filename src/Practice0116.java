public class Practice0116 {
    /*
    متدی بنویسید که یک آرایه از اعداد و یک عدد را دریافت کند، سپس با جستجو در آرایه، در صورت وجود درست برگرداند و در صورت عدم وجود نادرست برگرداند.

    Write a method to get an array of numbers and a number, then search the array to return true if Exist and false if not Exists.

     */

    public static void  main (String [] Args)
    {
        int [] MyArray = new int [] {1,2,3,4,5,6,7,8,9,10};
        int num = 51;
        System.out.println(ExistNumberinArray(MyArray,num));
    }

    static boolean ExistNumberinArray (int [] Array , int number)
    {
        for (int i =0 ; i<Array.length ; i++)
        {
            if (Array[i]==number)
                return true ;


        }
        return  false;
    }
}
//https://github.com/AhmadR3zA1911/JavaExercise
