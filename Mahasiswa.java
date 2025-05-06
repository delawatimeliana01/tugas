public class Mahasiswa<T1, T2, T3> {
    private T1 nim;
    private T2 nama;
    private T3 kelas;

    public void setNim(T1 nim) {
        this.nim = nim;
    }

    public void setNama(T2 nama) {
        this.nama = nama;
    }

    public void setKelas(T3 kelas) {
        this.kelas = kelas;
    }

    public T1 getNim() {
        return nim;
    }

    public T2 getNama() {
        return nama;
    }

    public T3 getKelas() {
        return kelas;
    }
}
