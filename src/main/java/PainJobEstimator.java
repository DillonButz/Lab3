import java.util.Scanner;

public class PainJobEstimator 
{
    public static void main(String[] args) 
    {
        Scanner makeNewScanner = new Scanner(System.in);
        
        System.out.println("Please enter number of rooms to be painted");
        double numberOfRooms = makeNewScanner.nextDouble();
        
        System.out.println("Please enter price of paint per gallon: ");
        double priceOfPaint = makeNewScanner.nextDouble();
        
        System.out.println("Please enter total square feet to be painted: ");
        double totalSquareFeet = makeNewScanner.nextDouble();
        
        int totalGallons = numberOfGallonsOfPaint(totalSquareFeet);
        double totalPriceOfPaint =totalPriceOfPaint(totalGallons,priceOfPaint);
        int hoursOfWork = hoursOfWork(totalSquareFeet);
        double totalPriceOfLabor = totalPriceOfLabor(hoursOfWork);
        double totalPriceOfJob = totalPriceOfJob(totalPriceOfLabor, totalPriceOfPaint);
        
        System.out.println("Total gallons need for job are: "+ totalGallons);
        System.out.println("Total price of the paint needed for the job is: "+totalPriceOfPaint);
        System.out.println("Total hours needed to complete the job are: "+ hoursOfWork);
        System.out.println("Total cost of labor is: "+ totalPriceOfLabor);
        System.out.println("Final price for the paint job is: "+ totalPriceOfJob);
        
    }
    public static int numberOfGallonsOfPaint(double number)
    {
        double calculations = number / 115;
        int totalGallons = (int) Math.rint(calculations);
        
        return totalGallons;
    }
    
    public static int hoursOfWork(double number)
    {
        double calculations = number / 115;
        int totalHours = (int) Math.rint(calculations);
        int totalHoursWorked = totalHours * 8;
        return totalHoursWorked;
    }
    
    public static double totalPriceOfPaint(double number1,double number2)
    {
        double totalPrice = number1 * number2;
        return totalPrice;
    }
    
    public static double totalPriceOfLabor(double number1)
    {
        double price = number1 * 8;
        return price;
    }
    
    public static double totalPriceOfJob(double number1, double number2)
    {
        double calculations = number1+number2;
        return calculations;
    }
    
}
