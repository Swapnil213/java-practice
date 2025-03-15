import java.text.DecimalFormat;
import java.util.Scanner;

public class cogniTest2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // -------------------------------------------------------------------------------------------
        // Cognizant Practice #4
        // mileage per 100km as well in miles per gallon
        // DecimalFormat df = new DecimalFormat("0.00");
        // System.out.println("Enter value of fuel(in litre)");
        // double litre = sc.nextDouble();
        // System.out.println("Enter value of distance(in Km)");
        // double distance = sc.nextDouble();

        // if (litre < 0) {
        //     System.out.println(litre + " is invalid input");
        // }

        // if (distance < 0) {
        //     System.out.println(distance + " is invalid input");
        // }

        // double kmresult = (litre / distance) * 100;
        // System.out.println("Litres/100KM");
        // System.out.println(df.format(kmresult));

        // double gallon = litre * 0.2642;
        // double miles = distance * 0.6214;

        // double milesresult = (miles / gallon);
        // System.out.println("Miles/Gallon");
        // System.out.println(df.format(milesresult));


        // -------------------------------------------------------------------------------------------
        // Cognizant Practice #4
        // Genrate Bill in Movie theatre

        System.out.print("Enter Number of Pizzas Brought :");
        int numberOfPizza = sc.nextInt();
        System.out.print("Enter Number of Puffs Brought :");
        int numberOfPuffs = sc.nextInt();
        System.out.print("Enter Number of Cooldrinks Brought :");
        int numberOfDrinks = sc.nextInt();
        System.out.println("");

        int Total = numberOfPizza * 100 + numberOfPuffs * 20 + numberOfDrinks * 10;

        System.out.println("Bill Details");
        System.out.println("");

        System.out.println("No of Pizzas : "+ numberOfPizza);
        System.out.println("No of Puffs : " + numberOfPizza);
        System.out.println("No of Cooldrinks : " + numberOfDrinks);
        System.out.println("Total Price : " + Total);

        System.out.println("");
        System.out.println("Enjoy the Show..");

        sc.close();
    }
}
