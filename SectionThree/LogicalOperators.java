public class LogicalOperators {
    public static void main(String[] args) {
        /*
         *  OR ||
         *  AND &&
         */

         int chemistryGrade = 78;
         int englishGrade = 65;
         String language = "Java";

         if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("Congratulations you got the scholarship!");
         } else {
            System.out.println("We are sorry. You didn't get the scholarship!");
         }


         int credits = 56;
         double GPA = 3.2; 

         if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned a diploma");
         } else {
            System.out.println("Sorry, you need at least 40 credits and 2.0 of GPA");
         }

    }
}
