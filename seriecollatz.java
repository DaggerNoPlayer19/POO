import java.util.Scanner;

public class seriecollatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número positivo: ");
        int n = scanner.nextInt();
        imprimirCollatz(n);
        scanner.close();
    }

    // Función recursiva para imprimir la secuencia de Collatz
    public static void imprimirCollatz(int n) {
        System.out.print(n + " ");
        if (n == 1) {
            System.out.println();
            return;
        }
        if (n % 2 == 0) {
            imprimirCollatz(n / 2);
        } else {
            imprimirCollatz(n * 3 + 1);
        }
    }
}