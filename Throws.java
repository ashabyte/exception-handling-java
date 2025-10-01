public class Throws {

    static class UmurException extends Exception {
        public UmurException(String pesan) {
            super(pesan);
        }
    }

    public static void cekUmur(int umur) throws UmurException {
        if (umur < 18) {
            throw new UmurException("Umur harus >= 18!");
        }
        System.out.println("Umur valid: " + umur);
    }

    public static void main(String[] args) {
        try {
            cekUmur(15);
        } catch (UmurException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
