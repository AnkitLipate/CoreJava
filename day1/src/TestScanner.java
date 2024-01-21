import java.util.*;
public class TestScanner{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two num for multiplication");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.printf("Result = %.3f %n", (num1 * num2));
    }
}