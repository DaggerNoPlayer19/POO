import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Ingresa un numero entero positivo: ");
            numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("Por favor, ingresa un numero positivo.");
            } else {
                break;
            }
        }

        int cantidadDigitos;
        if (numero == 0) {
            cantidadDigitos = 1;
        } else {
            cantidadDigitos = 0;
            int tempNumero = numero;
            while (tempNumero > 0) {
                tempNumero /= 10;
                cantidadDigitos++;
            }
        }
        System.out.println("El numero " + numero + " tiene " + cantidadDigitos + " digitos.");
        scanner.close();
    }
}