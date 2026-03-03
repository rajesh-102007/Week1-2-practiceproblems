import java.util.*;
class l3p3
{
    static void main()
    {
        int maximumnumberofhandshakes;
        int numberOfStudents;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Students");
        numberOfStudents=sc.nextInt();
        maximumnumberofhandshakes=((numberOfStudents*(numberOfStudents-1))/2);
        System.out.println("The number of possible handshakes are"+  maximumnumberofhandshakes);
        
    }
}