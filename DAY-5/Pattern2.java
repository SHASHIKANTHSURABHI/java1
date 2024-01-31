public class Pattern2 {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int i,j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if(i==j||i==0&&j==2||i==2&&j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
