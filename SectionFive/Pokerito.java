import java.util.Scanner;

public class Pokerito {
    
    static int userMatches = 0;
    static int cpuMatches = 0;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println("- There are two players, you and the computer.");
        System.out.println("- The dealer will give each player one card.");
        System.out.println("- Then, the dealer will draw five cards (the river)");
        System.out.println("- The player with the most river matches wins!");
        System.out.println("- If the matches are equal, everyone's a winner!");
        System.out.println("- Ready? Type anything if you are.");

        scan.nextLine();

        String userCard = randomCard();
        String cpuCard = randomCard();

        System.out.println("Here's your card: ");
        System.out.println(userCard);
        System.out.println("\n");
        System.out.println("Here's CPU card: ");
        System.out.println(cpuCard);

        for (int i = 0; i < 5; i++) {

            System.out.println("Press enter to draw a card");
            scan.nextLine();
            String randomCard = randomCard();
            System.out.println(randomCard);

            if (randomCard.equals(userCard)){
                userMatches += 1;
            } else if (randomCard.equals(cpuCard)) {
                cpuMatches += 1;
            }

        }

        System.out.println("User matches: " + userMatches);
        System.out.println("CPU matches: " + cpuMatches);
        if (userMatches > cpuMatches) {
            System.out.println("You win!");
        } else if (cpuMatches > userMatches) {
            System.out.println("CPU wins!");
        } else {
            System.out.println("Tie game!");
        }


        scan.close();
    }

    public static String randomCard(){
        double card = Math.random() * 12 + 1;

        switch ((int)card) {
                case 1:   
                return "   _____\n"+
                       "  |A _  |\n"+ 
                       "  | ( ) |\n"+
                       "  |(_'_)|\n"+
                       "  |  |  |\n"+
                       "  |____V|\n";
                case 2:
                return  "   _____\n"+              
                        "  |2    |\n"+ 
                        "  |  o  |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____Z|\n";
                case 3:
                return"   _____\n" +
                      "  |3    |\n"+
                      "  | o o |\n"+
                      "  |     |\n"+
                      "  |  o  |\n"+
                      "  |____E|\n";
    
                case 4:
                return "   _____\n" +
                       "  |4    |\n"+
                       "  | o o |\n"+
                       "  |     |\n"+
                       "  | o o |\n"+
                       "  |____h|\n";
    
                case 5:
                return  "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
    
                case 6:
                return  "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
    
                case 7:
                return  
                        "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
              
    
                case 8:
                return  "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
                case 9:
                return  "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
    
                case 10:
                return  "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
                case 11:
                return  "   _____\n" +
                        "  |J  ww|\n"+ 
                        "  | o {)|\n"+ 
                        "  |o o% |\n"+ 
                        "  | | % |\n"+ 
                        "  |__%%[|\n";
                case 12:
                return  "   _____\n" +
                        "  |Q  ww|\n"+ 
                        "  | o {(|\n"+ 
                        "  |o o%%|\n"+ 
                        "  | |%%%|\n"+ 
                        "  |_%%%O|\n";
                case 13:
                return  "   _____\n" +
                        "  |K  WW|\n"+ 
                        "  | o {)|\n"+ 
                        "  |o o%%|\n"+ 
                        "  | |%%%|\n"+ 
                        "  |_%%%>|\n";
                default: 
                return "This shouldn't get called.";
                    }
    }
}
