public class Practice0115 {
    /*
    متدی بنویسید که دو آرایه از اعداد که تعداد عناصر آنها یکسان است را به صورت پارامتر دریافت کند،
     سپس عناصر با مقایسة عناصر آرایه، آرایة جدیدی تولید کند که مقدار هر عنصر آن، عنصربزرگتر در هریک از دو آرایه باشد

     Create a method to get two arrays of numbers with the same number of elements as a parameter,
     then by comparing the elements of the array to generate a new array whose value of each element is
     the largest element in each of the two arrays
     */
    public static void main (String [] args)
    {
        int [] Team1 = new int [] {10,16,52,6,3,99,3,2,0};
        int [] Team2 = new int [] {15,16,56,88,1,9,30,12,0};
        int [] FinalTeam = new int [Team1.length];
        if (Team1.length==Team2.length) {
            FinalTeam = CreateMaxArray(Team1, Team2);
            for(int i = 0 ; i < FinalTeam.length ; i++)
            {
                System.out.println(FinalTeam[i]);
            }
        }
        else
            System.out.println("2 Arrays not Equals.");

    }


    static  int [] CreateMaxArray (int [] T1 , int [] T2)
    {
        int [] MaxNum = new int [T1.length];

        for (int i = 0 ; i <T1.length ; i++)
        {
            if (T1[i]<=T2[i])
                MaxNum[i]=T2[i];
            else
                MaxNum[i]=T1[i];
        }
        return MaxNum;
    }
}
//https://github.com/AhmadR3zA1911/JavaExercise
