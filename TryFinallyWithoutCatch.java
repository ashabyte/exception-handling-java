public class TryFinallyWithoutCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Membuka koneksi database...");
            int angka = 30 / 0; // error, tidak valid
            System.out.println("Hasil: " + angka);
        } finally {
            System.out.println("Menutup koneksi database (selalu jalan).");
        }
        System.out.println("Program tetap berjalan setelah finally.");//baris ini tidak dieksekusi
    }
}