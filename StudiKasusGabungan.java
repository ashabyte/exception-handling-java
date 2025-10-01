public class StudiKasusGabungan {

    // Method login dengan throws
    public static void login(String username, String password) throws Exception {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("Username/Password tidak boleh kosong!");
        }
        if (!username.equals("admin") || !password.equals("1234")) {
            throw new Exception("Login gagal! Username atau Password salah.");
        }
        System.out.println("Login berhasil! Selamat datang, " + username);
    }

    public static void main(String[] args) {
        try {
            // Ambil console bawaan Java
            java.io.Console console = System.console();

            String user = console.readLine("Masukkan Username: ");
            char[] passArray = console.readPassword("Masukkan Password: ");
            String pass = new String(passArray);

            login(user, pass);

        } catch (IllegalArgumentException e) {
            System.out.println("Error Input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error Login: " + e.getMessage());
        } finally {
            System.out.println("Proses login selesai.");
        }
    }
}