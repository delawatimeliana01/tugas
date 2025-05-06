package kebunbinatang.main;

import kebunbinatang.model.*;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Hewan> daftarHewan = new ArrayList<>();

        daftarHewan.add(new Karnivora("Singa"));
        daftarHewan.add(new Herbivora("Kambing"));
        daftarHewan.add(new Karnivora("Harimau"));
        daftarHewan.add(new Herbivora("Jerapah"));

        for (Hewan hewan : daftarHewan) {
            hewan.bersuara();
            hewan.makan("Makanan favorit");
            System.out.println();
        }
    }
}

