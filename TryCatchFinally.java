public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int angka = 10 / 0;//tidak valid dalam matematika, sengaja di errorkan
            System.out.println("Hasil: " + angka);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Blok finally tetap bisa dijalankan.");
        }
        System.out.println("Program masih menghasilkan output setelah try-catch-finally.");
    }
}