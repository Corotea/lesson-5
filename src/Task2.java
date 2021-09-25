import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] arr = new int[rows][columns];

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = scanner.nextInt();
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
