import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistroProductos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreProducto;
        int stockProducto;

        System.out.println("--- Registro de Productos ---");

        System.out.print("Ingresa el nombre del producto: ");
        nombreProducto = scanner.nextLine();

        System.out.print("Ingresa la cantidad en stock del producto: ");
        try {
            stockProducto = scanner.nextInt();

            if (stockProducto >= 0) {
                Producto producto = new Producto(nombreProducto, stockProducto);
                producto.verificarDisponibilidad();
            } else {
                System.out.println("El stock no puede ser negativo.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada invalida para el stock. Por favor, ingresa un numero entero.");
        } finally {
            scanner.close();
        }
    }
}