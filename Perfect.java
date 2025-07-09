public class Perfect {
    public static void main(String[] args) {
        System.out.println("Números perfectos del 1 al 1000:");
        for (int num = 1; num <= 1000; num++) {
            int suma = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    suma += i;
                }
            }
            if (suma == num) {
                System.out.println(num);
            }
        }
    }
}