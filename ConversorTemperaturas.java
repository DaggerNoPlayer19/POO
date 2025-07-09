import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorTemperaturas { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double temperatura;
        double resultado;

        do {
            System.out.println("\n--- Conversor de Temperaturas ---");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Por favor, ingresa un numero.");
                scanner.next();
                opcion = -1;
                continue;
            }

            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Ingresa la temperatura en Celsius: ");
                try {
                    temperatura = scanner.nextDouble();
                    resultado = (temperatura * 9 / 5) + 32;
                    System.out.printf("%.2f Celsius son %.2f Fahrenheit%n", temperatura, resultado);
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar un numero para la temperatura.");
                    scanner.next();
                }
            } else if (opcion == 2) {
                System.out.print("Ingresa la temperatura en Fahrenheit: ");
                try {
                    temperatura = scanner.nextDouble();
                    resultado = (temperatura - 32) * 5 / 9;
                    System.out.printf("%.2f Fahrenheit son %.2f Celsius%n", temperatura, resultado);
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar un numero para la temperatura.");
                    scanner.next();
                }
            } else if (opcion == 0) {
                System.out.println("Saliendo del conversor. ¡Hasta pronto!");
            } else {
                System.out.println("Opcion no valida. Por favor, elige 1, 2 o 0.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}