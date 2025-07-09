public class palindromo {
    public static void main(String[] args) {
        for (int i = 10; i <= 999; i++) {
            if (esPalindromo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esPalindromo(int numero) {
        String original = Integer.toString(numero);
        int n = original.length();
        for (int i = 0; i < n / 2; i++) {
            if (original.charAt(i) != original.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
