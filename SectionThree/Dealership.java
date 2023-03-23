import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Dealership");

        System.out.println("Select option 'a' to buy a car");
        System.out.println("Select option 'b' to sell a car");

        Scanner scan = new Scanner(System.in);

        String option = scan.nextLine();

        // if (option.equals("a")) {

        // } else {

        // }

        switch (option) {
            case "a": 
                System.out.println("What's your budget?");
                int budget = scan.nextInt();
                if (budget >= 10_000) {
                    System.out.println("Great! A Nissan Altima is available");
                    System.out.println("Do you have a driver licence? y / n");
                    scan.nextLine();
                    String licence = scan.nextLine();
                    if (licence.equals("y")) {
                        System.out.println("Do you have insurance? y / n");
                        String insurance = scan.nextLine();
                        if (insurance.equals("y")) {
                            System.out.println("Here are the keys for your car!");
                        } else {
                            System.out.println("You need to hire an insurance!");
                        }
                    } else {
                        System.out.println("Without a licence you can't buy a car. Sorry!");
                    }
                } else {
                    System.out.println("We don't sell cars under $10,000. Sorry");
                }
                break;
            case "b":
                int cost = 30_000;
                System.out.println("How much is your car?");
                int price = scan.nextInt();
                if (price < cost) {
                    System.out.println("Here is your money!! Great bussiness");
                }
                break;
            default: System.out.println("pick a or b");
        }

        scan.close();


    }
}
