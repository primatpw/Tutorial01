public class Mahasiswa {
    protected String nama;
    protected String npm;

    public Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
    }

    public String getnama() {
        return nama;
    }

    public String getnpm() {
        return npm;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setnpm(String npm) {
        this.npm = npm;
    }
}
