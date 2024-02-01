import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter the number");
        int number = n.nextInt();
        n.close();
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}