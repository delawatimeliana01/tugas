package kebunbinatang.model;

public class Herbivora extends Hewan {
    public Herbivora(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " mengembik!");
    }

    @Override
    public void makan(String makanan) {
        System.out.println(getNama() + " makan " + makanan + " (tumbuhan).");
    }
}

