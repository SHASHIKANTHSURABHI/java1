import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Register Number:");
        int registerNumber = s.nextInt();
        System.out.println("Enter Name:");
        String name = s.next();
        System.out.println("Enter Result:");
        String result = s.next();
        System.out.println("Enter Grade:");
        char grade = s.next().charAt(0);
        System.out.println("Enter percentage:");
        float percentage=s.nextFloat();
        System.out.println("\nEntered Details:");
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Name: " + name);
        System.out.println("Result: " + result);
        System.out.println("Grade: " + grade);
        System.out.println("Percentage: " + percentage);
    }
}
