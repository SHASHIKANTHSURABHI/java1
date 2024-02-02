import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int num = n.nextInt();
        n.close();
        for (int i = num; i >=1; i--) {
            for (int j = 0; j <num-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2 * i - 1; k++) {
                System.out.print('*');
            }
            System.out.println(" ");
        }
    }
}

