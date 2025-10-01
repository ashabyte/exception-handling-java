public class ThrowWithoutJavaio {
    public static void bagi(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol!");
        }
        System.out.println("Hasil: " + (a / b));
    }

    public static void main(String[] args) {
        try {
            bagi(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
