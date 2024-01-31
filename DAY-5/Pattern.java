public class Pattern {
    public static void main(String[] args) {
        int size = 3;
        char[][] matrix = new char[size][size];

        char currentChar = '$';
        boolean isStar = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isStar) {
                    matrix[i][j] = '*';
                } else {
                    matrix[i][j] = currentChar;
                }
                isStar = !isStar;
            }
            if (currentChar == '$') {
                currentChar = '#';
            } else {
                currentChar = '$';
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
