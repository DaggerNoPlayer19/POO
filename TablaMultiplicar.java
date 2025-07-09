import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroTabla;

        while (true) {
            System.out.print("Ingresa un numero para ver su tabla de multiplicar: ");
            numeroTabla = scanner.nextInt();
            break;
        }

        int multiplicador = 1;

        System.out.println("Tabla de multiplicar del " + numeroTabla + ":");
        while (multiplicador <= 10) {
            int resultado = numeroTabla * multiplicador;
            System.out.println(numeroTabla + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }
        scanner.close();
    }
}