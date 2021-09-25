import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] arr = new int[rows][columns];

        int start = 1;

        for (int j = 0; j < columns; j++) {
            for(int i = 0; i < rows; i++){
                arr[i][j] = start++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
