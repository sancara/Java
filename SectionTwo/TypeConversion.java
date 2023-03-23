public class TypeConversion {

    public static void main(String[] args) {

        int ants = 2000;
        int purchasedBlocksOfCheese = 1;

        System.out.println("There are " + ants + " ants, and " + purchasedBlocksOfCheese + " block of cheese.");
        // casting data type before doing the operation
        System.out.println("Each ant carried " + ((double)purchasedBlocksOfCheese / ants) + " from the total cheese amount"); 

        double salary = 5423.94;
        // here we are interested in a whole number
        // declare a variable with type int, and assing a double value, casted to int before assingment
        int roundedSalary = (int)salary;
        System.out.println("Mortgage Broker: What is your monthly salary in dollars?");
        System.out.println("My monthly salary is: " + roundedSalary);


    }

}
