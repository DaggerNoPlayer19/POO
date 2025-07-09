import java.util.InputMismatchException;
import java.util.Scanner;

public class PiramideNumerica {
    public static void main(String[] args) {
        System.out.println("=== Ejecutando: Piramide Numerica ===");
        Scanner scanner = new Scanner(System.in);
        int altura;

        try {
            System.out.print("Ingrese la altura de la piramide (1-9): ");
            altura = scanner.nextInt();

            if (altura >= 1 && altura <= 9) {
                for (int i = 1; i <= altura; i++) {
                    // Imprimir espacios
                    for (int j = 1; j <= (altura - i); j++) {
                        System.out.print(" ");
                    }
                    // Imprimir numeros
                    for (int k = 1; k <= i; k++) {
                        System.out.print(k + " ");
                    }
                    System.out.println(); // Nueva linea para la siguiente fila
                }
            } else {
                System.out.println("Altura invalida. Debe ser entre 1 y 9.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada invalida. Por favor, ingrese un numero entero.");
        } finally {
            // No cerrar scanner aqui, ya que es gestionado por MenuPrincipal
        }
        System.out.println("=== Fin de Piramide Numerica ===");
    }
}