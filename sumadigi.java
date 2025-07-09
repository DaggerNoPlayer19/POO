public class sumadigi {
    public static void main(String[] args) {
        for (int i = 100; i <= 110; i++) {
            int suma = 0;
            for (int n = i; n > 0; n = n / 10) {
                if (n > 0) {
                    suma += n % 10;
                }
            }
            System.out.println("Número: " + i + " - Suma de dígitos: " + suma);
        }
    }
}
