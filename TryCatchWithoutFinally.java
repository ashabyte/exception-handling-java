public class TryCatchWithoutFinally {
    public static void main(String[] args) {
        try {
            int angka = 20 / 0; //sengaja di errorkan
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
        System.out.println("Program tetap berlanjut setelah catch.");
    }
}