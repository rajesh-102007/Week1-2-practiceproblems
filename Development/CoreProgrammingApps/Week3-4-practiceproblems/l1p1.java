import java.util.*;
class l1p1
{
    public static void main(String[] args)
    {
        int number;
         String x="Yes";
         String y="No";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number=sc.nextInt();
        if (number%5==0)System.out.println(x);
        else
        System.out.println(y);
        System.out.println("Is the number "+number+" divisible by 5?");
    }
}