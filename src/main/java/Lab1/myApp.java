package Lab1;
import Lab1.myLibrary;

public class myApp {
    public static void main(String[] args) {

        int num1 = 2;
        int exp = 4;

        System.out.println("Hi !");

        System.out.println("Factorial of "+num1+": "+ myLibrary.factorial(num1));
        System.out.println(" "+num1 +" power of "+exp + " will be " + myLibrary.Power(num1, exp));
        System.out.println("Done!!");
    }
}
