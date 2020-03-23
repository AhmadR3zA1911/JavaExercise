public class Practice0103 {
    /*متدی بنویسید که آرایهای از اعداد را به عنوان پارامتر دریافت میکند و مقادیر آنرا در خروجی
    فراخوانی کنید. main() استاندارد چاپ میکند سپس آنرا از طریق متد
    Write a method that receives arrays of numbers as a parameter and outputs the values in the output
    Call. main () prints the standard then returns it via the method */

    public static void main(String[] Args) {
        int[] Num = {100, 155, 56, 3, 2, 6, 564, 800, 126};
        PrintArrayList(Num);
    }

    static void PrintArrayList(int[] Numbers) {
        for (int i = 0; i < Numbers.length; i++) {
            System.out.println("Number[" + i + "]:" + Numbers[i]);
        }
    }
}
//https://github.com/AhmadR3zA1911/JavaExercise
