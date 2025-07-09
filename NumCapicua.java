import java.util.Scanner;

public class NumCapicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fin;

        System.out.print("Ingresa el numero inicial del rango: ");
        inicio = sc.nextInt();
        System.out.print("Ingresa el numero final del rango: ");
        fin = sc.nextInt();

        System.out.println("Numeros capicua en el rango:");
        for (int i = inicio; i <= fin; i++) {
            if (esCapicua(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }

    public static boolean esCapicua(int numero) {
        int original = numero;
        int inverso = 0;

        while (numero > 0) {
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero /= 10;
        }

        return original == inverso;
    }
}
