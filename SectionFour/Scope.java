public class Scope {

    static int dogs = 10;
    // dogs can be acceded from anywhere because it's a class variable
    public static void main(String[] args) {
        System.out.println(dogs);
        System.out.println(apples);
    }

    public static void someFunction() {
        int apples = 5; 
        // apples is a function variable, and can only be accessed inside the function
        System.out.println(apples);
    }
}
