public class NumPrimos {
    public static void main(String[] args) {
        System.out.println("Números primos del 1 al 100:");
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}