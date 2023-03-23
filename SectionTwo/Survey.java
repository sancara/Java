import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        int counter = 0; 

        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("Welcome. Thank you for taking the survey");

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        counter ++;
        
        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();
        counter ++;
        
        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        counter ++;
        

        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();   
        counter ++;
        
        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();
        counter ++;
        
        scanner.close();

        double totalPriceCoffee = coffeeAmount * coffeePrice;
        double totalPriceFood = foodAmount * foodPrice;

        

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("Thank you "+ name + " for answering all " + counter + " questions");
        System.out.println("Weekly, you spend $" + totalPriceCoffee +" on coffee");
        System.out.println("Weekly, you spend $" + totalPriceFood + " on food");

    }
}