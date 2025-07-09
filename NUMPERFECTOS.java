import java.util.Scanner;

public class NUMPERFECTOS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        // Recorre todos los números desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            int suma = 0;
            // Suma los divisores propios positivos de i
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma += j;
                }
            }
            // Si la suma de los divisores es igual al número, es perfecto
            if (suma == i) {
                System.out.println(i + " es un número perfecto.");
            }
        }
        scanner.close();
    }
}
/*
Otra forma de hacer este código es utilizando un método separado para verificar si un número es perfecto.
Por ejemplo:
*/

public static boolean esPerfecto(int numero) {
    int suma = 0;
    for (int i = 1; i <= numero / 2; i++) {
        if (numero % i == 0) {
            suma += i;
        }
    }
    return suma == numero;
}

// Y en el main podrías usar:
for (int i = 1; i <= n; i++) {
    if (esPerfecto(i)) {
        System.out.println(i + " es un número perfecto.");
    }
}