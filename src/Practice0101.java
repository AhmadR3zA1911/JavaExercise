public class Practice0101 {
//آرایهای 10 تایی از اعداد بسازید و مقادیر آنرا در خروجی استاندارد چاپ کنید.
//Create 10 arrays of numbers and print them in standard output.
    public static void main(String[] args) {

        int [] ArrayTemp = {1,2,6,4,5,8,9,6,2,10}; // Solution 1
        int [] ArrayTemp2 = new int[] {10,20,30,40,50,60,70,80,90,100}; //Solution 2
        for (int i=0 ; i<ArrayTemp.length; i++)
        {
            System.out.println("Temp["+i+"]:"+ArrayTemp[i]);
        }
        System.out.println("----------------------------------------------------");
        for (int j=0;j<ArrayTemp2.length;j++)
        {
            System.out.println("Temp2["+j+"]:"+ArrayTemp2[j]);
        }
    }
}
//https://github.com/AhmadR3zA1911/JavaExercise
