import java.util.Scanner;

public class PASCAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas del Triángulo de Pascal: ");
        int n = scanner.nextInt();

        int[][] pascal = new int[n][n];

        // Calcula los valores del triángulo
        for (int i = 0; i < n; i++) {
            pascal[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        // Imprime el triángulo
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", pascal[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}