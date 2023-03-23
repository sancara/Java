import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        
        System.out.println("Enter three numbers between 1 and 6");
        int choice1 = scan.nextInt();
        int choice2 = scan.nextInt();
        int choice3 = scan.nextInt();

        if (choice1 < 1 || choice2 < 1 || choice3 < 1) {
            System.out.println("Number can't be less than 1. Shutting the game down");
            System.exit(0);
        }
        
        if (choice1 > 6 || choice2 > 6 || choice3 > 6) {
            System.out.println("Number can't be greater than 6. Shutting the game down");
            System.exit(0);
        }

        int sumOfNumbers = choice1 + choice2 + choice3;
        int sumDiceRolls = roll1 + roll2 + roll3;

        System.out.println("dice sum = " + sumDiceRolls + ". Numbers sum = " + sumOfNumbers);

        if (checkWin(sumDiceRolls, sumOfNumbers)) {
            System.out.println("Congrats! You win!");
        } else {
            System.out.println("Hope you're lucky next time");
        }

        scan.close();

    }

    public static int rollDice() {
        
        double number = Math.random() * 6 + 1;
        
        return (int)number;
    }

    public static boolean checkWin (int diceSum, int numSum){
        
        return (numSum > diceSum && (numSum - diceSum) < 3);

    }
           
        
    
}
