import javax.sound.midi.SysexMessage;

public class Practice0112 {
    /*
    برنامه ای بنویسید که یک آرایة دو بعدی از اعداد دریافت کند و یک آرایة یک بعدی برگرداند به
گونه ای که هر عنصر آرایة تولید شده برابر با مجموع عناصر هر ستون آرایة اولیه باشد.
Write a program that receives a two-dimensional array of numbers and returns a one-dimensional array to
The manner in which each element of the generated array is equal to the sum of the elements of each primary array.
     */

    public static void main(String[] args) {

        int [] [] Numbers = {{10,20,30,40},{2,4,6,8},{50,90,50,69},{82,9,5,10}};
        int [] NewNumber = new int [Numbers.length];
        NewNumber = SumArrayColumn(Numbers);
        for (int i = 0 ; i<NewNumber.length;i++)
        {
            System.out.println(NewNumber[i]);
        }

    }
    // This method does not work properly for rows and columns inequalities
    static int [] SumArrayColumn (int [] [] nums)
    {
        int sum = 0;
        int [] MyArray = new int[nums.length];

        for (int j = 0 ; j < nums[0].length ; j++ ) //Column
        {
            for (int i = 0 ; i<nums.length; i++)  //Row
            {
                sum+=nums[i][j];
            }
            MyArray[j]=sum;
            sum=0;
        }
        return  MyArray;
    }
}
//https://github.com/AhmadR3zA1911/JavaExercise
