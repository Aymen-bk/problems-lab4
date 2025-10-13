package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        //changing the first part for Q6 and for Q5 everytime we output an index we add one to it
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of salespeople : ");
        int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": "); //i+1 to not get id=0
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;

        // using the loop to get the max/min and indexes
        int max_sale = sales[0];
        int max_index = 0;
        int min_sale = sales[0];
        int min_index = 0;

        for (int i=0; i<sales.length; i++)
        {
            if(sales[i] > max_sale)
            {
                max_sale = sales[i];
                max_index = i;
            }
            if(sales[i] < min_sale){
                min_sale = sales[i];
                min_index = i;
            }

            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);

        //new implementations

        System.out.println("\nAvergae sales : " + (sum/sales.length));

        System.out.println("Salesperson "+ (max_index+1) +" had the highest sale with $" + max_sale);
        System.out.println("Salesperson "+ (min_index+1) +" had the lowest sale with $" + min_sale);

        System.out.println("Type a value not to be exceeded : ");
        int exceed =  scan.nextInt();
        int number_of_exceeds = 0;
        for (int i=0; i<sales.length; i++)
        {
            if(sales[i] > exceed)
            {
                number_of_exceeds++;
                System.out.println("ID : " + (i+1) + " Has exceeded the given value ($"+sales[i]+")");
            }
        }
        System.out.println("The total number of salespeople whose sales exceeded the value entered : " + number_of_exceeds);
        scan.close();
    }
}
