import java.util.Scanner;

public class SumarCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSuma = 0;
        int numero = -1;

        System.out.println("Ingresa numeros para sumar (ingresa 0 para terminar):");

        while (numero != 0) {
            System.out.print("Ingresa un numero: ");
            numero = scanner.nextInt();
            totalSuma += numero;
        }

        System.out.println("La suma total es: " + totalSuma);
        scanner.close();
    }
}