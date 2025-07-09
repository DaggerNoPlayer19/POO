import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistroVehiculos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String marcaVehiculo;
        int anioVehiculo;

        System.out.println("--- Registro de Vehiculos ---");

        System.out.print("Ingresa la marca del vehiculo: ");
        marcaVehiculo = scanner.nextLine();

        System.out.print("Ingresa el año de fabricacion del vehiculo (ej. 2018): ");
        try {
            anioVehiculo = scanner.nextInt();

            if (anioVehiculo > 1900 && anioVehiculo <= 2025) {
                Vehiculo vehiculo = new Vehiculo(marcaVehiculo, anioVehiculo);
                vehiculo.verificarCirculacion();
            } else {
                System.out.println("Año de fabricacion invalido.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada invalida para el año. Por favor, ingresa un numero entero.");
        } finally {
            scanner.close();
        }
    }
}