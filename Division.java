import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    // Metodo para realizar la operacion de division
    public static void ejecutarOperacion(Scanner scanner) {
        System.out.println("\n--- Operacion: Division ---");
        try {
            System.out.print("Ingresa el dividendo: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Ingresa el divisor: ");
            double numero2 = scanner.nextDouble();

            if (numero2 != 0) { // Importante: verificar division por cero
                double resultado = numero1 / numero2;
                System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + resultado);
            } else {
                System.out.println("Error: No se puede dividir por cero.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un numero valido.");
            scanner.next(); // Limpia la entrada incorrecta del buffer
        }
    }

    // Metodo main opcional para ejecutar Division.java de forma independiente
    public static void main(String[] args) {
        Scanner localScanner = new Scanner(System.in);
        ejecutarOperacion(localScanner);
        localScanner.close();
    }
}
