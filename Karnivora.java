package kebunbinatang.model;

public class Karnivora extends Hewan {
    public Karnivora(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " mengaum!");
    }

    @Override
    public void makan(String makanan) {
        System.out.println(getNama() + " makan " + makanan + " (daging).");
    }
}

