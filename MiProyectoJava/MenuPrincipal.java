import java.util.InputMismatchException; // Necesario para manejar entradas no numericas
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== MENU PRINCIPAL ====");
            System.out.println("1. Contador de Notas");
            System.out.println("2. Contador con While");
            System.out.println("3. Piramide Numerica");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de linea despues de nextInt()
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada invalida. Por favor, ingrese un numero.");
                scanner.nextLine(); // Limpiar el buffer del scanner
                opcion = -1; // Asignar un valor invalido para repetir el bucle
                continue; // Saltar al siguiente ciclo del do-while
            }

            switch (opcion) {
                case 1:
                    ContadorDeNotas.main(null); // Llamada al metodo main de ContadorDeNotas
                    break;
                case 2:
                    ContadorWhile.main(null); // Llamada al metodo main de ContadorWhile
                    break;
                case 3:
                    PiramideNumerica.main(null); // Llamada al metodo main de PiramideNumerica
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
            System.out.println(); // Salto de linea para separar la salida de cada programa
        } while (opcion != 0);

        scanner.close(); // Cerrar el scanner al finalizar
    }
}