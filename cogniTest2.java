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
        // System.out.println(litre + " is invalid input");
        // }

        // if (distance < 0) {
        // System.out.println(distance + " is invalid input");
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

        // System.out.print("Enter Number of Pizzas Brought :");
        // int numberOfPizza = sc.nextInt();
        // System.out.print("Enter Number of Puffs Brought :");
        // int numberOfPuffs = sc.nextInt();
        // System.out.print("Enter Number of Cooldrinks Brought :");
        // int numberOfDrinks = sc.nextInt();
        // System.out.println("");

        // int Total = numberOfPizza * 100 + numberOfPuffs * 20 + numberOfDrinks * 10;

        // System.out.println("Bill Details");
        // System.out.println("");

        // System.out.println("No of Pizzas : "+ numberOfPizza);
        // System.out.println("No of Puffs : " + numberOfPizza);
        // System.out.println("No of Cooldrinks : " + numberOfDrinks);
        // System.out.println("Total Price : " + Total);

        // System.out.println("");
        // System.out.println("Enjoy the Show..");

        // -------------------------------------------------------------------------------------------
        // Cognizant Practice #5
        // Show Characters corresponding to digits entered

        // System.out.println("Enter the digits : ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int d = sc.nextInt();

        // System.out.println("Corresponding Characters : ");

        // System.out.println(a + "-" + (char)a);
        // System.out.println(b + "-" + (char)b);
        // System.out.println(c + "-" + (char)c);
        // System.out.println(d + "-" + (char)d);

        // -------------------------------------------------------------------------------------------
        // Cognizant Practice #6
        // Show the incremented salary using appraisal rating

        // System.out.println("Enter Salary : ");
        // int salary = sc.nextInt();
        // System.out.println("Enter Rating (between 1 and 5) : ");
        // int rating = sc.nextInt();
        // int appraisal = 0;

        // if (rating < 1) {
        //     System.out.println("Enter valid Rating!!");
        // } else if (rating <= 3 && rating > 1) {
        //     appraisal = (salary * 10) / 100;
        // } else if (rating <= 4 && rating > 3) {
        //     appraisal = (salary * 25) / 100;
        // } else if (rating <= 5 && rating > 4) {
        //     appraisal = (salary * 30) / 100;
        // }

        // int newSalary = salary + appraisal;
        // System.out.println("Updated Salary is : "+ newSalary);

        // -------------------------------------------------------------------------------------------
        // Cognizant Practice #7
        // Check if entered number is lucky for aman or not

        // System.out.println("Enter Number : ");
        // int number = sc.nextInt();
        // int sum = 0;
        // int temp = number;

        // if (number > 1000 && number < 9999) {
        //     while (temp > 0) {
        //         sum = sum + temp % 10;
        //         temp = temp / 10;
        //     }
        //     if (sum%3 == 0 ||sum%5 == 0 ||sum%7 == 0 ) {
        //         System.out.println("Its a Lucky Number");
        //     } else {
        //         System.out.println("Its not a Lucky Number");
        //     }
        // }
        // else {
        //     System.out.println("Invalid Number!");
        // }

        // -------------------------------------------------------------------------------------------
        // Cognizant Practice #8
        // Help riya find factors of given number

        // System.out.println("Riya provide your number : ");
        // int num = sc.nextInt();

        // if (num == 0) {
        //     System.out.println("No factors found");
        // }
        // else if (num < 0) {
        //     num = num * -1;
        //     for (int i = 1; i <= num; i++) {
        //         if (num % i == 0) {
        //             System.out.print(i + " ");
        //         }
        //     }
        // }
        // else {
        //     for (int i = 1; i <= num; i++) {
        //         if (num % i == 0) {
        //             System.out.print(i + " ");
        //         }
        //     }
        // }

        // -------------------------------------------------------------------------------------------
        // Cognizant Practice #9
        // Print Season for corresponding month

        // System.out.println("Enter Month : ");
        // int month = sc.nextInt();

        // switch (month) {
        //     case 12:
        //     case 1:
        //     case 2:
        //         System.out.println("Season : Winter");
        //         break;
        //     case 3:
        //     case 4:
        //     case 5:
        //         System.out.println("Season : Spring");
        //         break;
        //     case 6:
        //     case 7:
        //     case 8:
        //         System.out.println("Season : Summer");
        //         break;
        //     case 9:
        //     case 10:
        //     case 11:
        //         System.out.println("Season : Autumn");
        //         break;
        //     default:
        //         System.out.println("InValid Month");
        // }

        // -------------------------------------------------------------------------------------------
        // Cognizant Practice #10
        // Print all primes in the interval a,b

        // System.out.println("Enter Your range as in a and b :");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int count = 0;

        // for (int i = a; i <= b; i++) {
        //     for (int j = 2; j < i - 1; j++) {
        //         if (i % j == 0) {
        //             count++;
        //         }
        //     }
        //     if (count < 1) {
        //         System.out.print(i + " ");
        //     }
        //     count = 0;
        // }

        sc.close();
    }
}
