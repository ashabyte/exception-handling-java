public class Throw {
    public static void cekUmur(int umur) {
        if (umur < 18) {
            throw new ArithmeticException("Umur harus >= 18!");
        } else {
            System.out.println("Umur valid: " + umur);
        }
    }

    public static void main(String[] args) {
        cekUmur(15); //akan melempar exception
    }
}