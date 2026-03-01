import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        System.out.println("The addition, subtraction, multiplication, and division of " + n1 + " and " + n2 + 
            " is " + (n1+n2) + ", " + (n1-n2) + ", " + (n1*n2) + ", and " + (n1/n2));
    }
}