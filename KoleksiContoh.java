import java.util.ArrayDeque;
import java.util.ArrayList;

public class KoleksiContoh {
    public static void main(String[] args) {
        // Menggunakan ArrayList untuk menyimpan daftar nama
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Citra");
        daftarNama.add("Dewi");

        System.out.println("Daftar Nama:");
        for (String nama : daftarNama) {
            System.out.println("- " + nama);
        }

        // Menggunakan ArrayDeque sebagai Queue untuk memproses nama
        ArrayDeque<String> antrianNama = new ArrayDeque<>();

        // Menambahkan semua nama ke antrian
        antrianNama.addAll(daftarNama);

        System.out.println("\nMemproses Antrian:");
        while (!antrianNama.isEmpty()) {
            String namaDiproses = antrianNama.poll(); // Mengambil dan menghapus elemen pertama
            System.out.println("Memproses: " + namaDiproses);
        }
    }
}
