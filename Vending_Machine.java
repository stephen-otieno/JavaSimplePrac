
import java.util.Scanner;


public class Vending_Machine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gumCount = 0;
        int chocolateCount = 0;
        int popcornCount = 0;
        int juiceCount = 0;

        while (true) {

            System.out.println("Select an option: ");
            System.out.println("1.Gum");
            System.out.println("2.Chocolate");
            System.out.println("3.Popcorn");
            System.out.println("4.Juice");
            System.out.println("5.Display total goods sold so far.");
            System.out.println("6.Exit");

            System.out.println("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                    case 1:
                     gumCount++;
                     System.out.println("Here is your gum");
                     break;

                    case 2:
                     chocolateCount++;
                     System.out.println("Here is your chocolate");
                     break;

                    case 3:
                     popcornCount++;
                     System.out.println("Here is your popcorn");
                     break;

                    case 4:
                     juiceCount++;
                     System.out.println("Here is your juice");
                     break;


                    case 5:
                        System.out.println(gumCount + " items of gum sold");
                        System.out.println(chocolateCount + " items of chocolate sold");
                        System.out.println(popcornCount + " items of popcorn sold");
                        System.out.println(juiceCount + " glasses of juice sold");
                          break;
                      
                    case 6:
                        System.out.println("Exiting program. Goodbye!");
                        input.close();
                        return;

                    
                         default:
                          System.out.println("Error! Select option 1-6 only.");

        }
 
    }  
 }

}
