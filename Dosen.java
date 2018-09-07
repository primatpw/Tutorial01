public class Dosen {
    protected String nama;
    protected String nidn;

    public Dosen(String nama, String nidn) {
        this.nama = nama;
        this.nidn = nidn;
    }

    public String getnama() {
        return nama;
    }

    public String getnidn() {
        return nidn;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setnidn(String nidn) {
        this.nidn = nidn;
    }
}
