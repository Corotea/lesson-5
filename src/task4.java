import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstSize = scanner.nextInt();
        int secondSize = scanner.nextInt();

        int[][] arr = new int[firstSize][secondSize];

        int start = 1;

        for (int j = 0; j < secondSize; j++) {
            for(int i = 0; i < firstSize; i++){
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
