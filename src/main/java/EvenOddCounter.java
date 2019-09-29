import java.util.Random;
public class EvenOddCounter {

    public static void main(String[] args)
    {
       Random rand = new Random();
       int randomInt;
       int i = 0;
       int totalEvenNumbers = 0;
       int totalOddNumbers = 0;
       while (i < 100)
               {
                 if (isEven(randomInt = rand.nextInt(100)) == true)
                 {
                     totalEvenNumbers++;
                     i++;
                 }else
                 {
                     totalOddNumbers++;
                     i++;
                 }
               }
       System.out.println("Total number of even numbers is " + totalEvenNumbers);
       System.out.println("Total number of odd numbers is " + totalOddNumbers);
    }

    public static boolean isEven(int number) {
        if ((number % 2) == 0)
        {
            return true; 
        }else {
            return false;
        }
    }
}
