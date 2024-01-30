import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        int[] myarray = new int[6];
        Scanner a=new Scanner(System.in);
        System.out.println("enter the elements");
        for(int i=0;i<6;i++)
        {
             myarray[i]=a.nextInt();
        }
        a.close();
        Arrays.sort(myarray);
        double median;
        if (myarray.length % 2 == 0) {
             median = (myarray[myarray.length / 2 - 1] + myarray[myarray.length / 2]) / 2;
        } else {
             median = myarray[myarray.length / 2];
        }
        System.out.println("Median of the array: " + median);
    }
}
