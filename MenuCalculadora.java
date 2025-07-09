import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCalculadora {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n--- Menu de Operaciones ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
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

            switch (opcion) {
                case 1:
                    Suma.ejecutarOperacion(scanner);
                    break;
                case 2:
                    Resta.ejecutarOperacion(scanner);
                    break;
                case 3:
                    Multiplicacion.ejecutarOperacion(scanner);
                    break;
                case 4:
                    Division.ejecutarOperacion(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}