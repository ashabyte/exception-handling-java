import java.io.*; //semuanya ada di package java.io.
public class ThrowsJavaio {
    public static void bacaFile(String namaFile) throws IOException {
        FileReader fr = new FileReader(namaFile); 
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
    }
    
    public static void main(String[] args) {
        try {
            bacaFile("contoh.txt"); //wajib ditangani dengan try-catch
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}