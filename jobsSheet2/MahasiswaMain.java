public class MahasiswaMain {
    public static void main(String[] args) {

        // OBJECT 1 (pakai constructor kosong)
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "123";
        mhs1.nama = "Andi";
        mhs1.kelas = "TI-1A";
        mhs1.ipk = 3.2;

        mhs1.tampilkanInformasi();

        // OBJECT 2 (pakai constructor parameter)
        Mahasiswa mhs2 = new Mahasiswa("456", "Budi", "TI-1B", 3.8);

        mhs2.tampilkanInformasi();

        // UPDATE DATA
        mhs1.ubahKelas("TI-2A");
        mhs1.updateIpk(3.9);

        System.out.println("Setelah Update:");
        mhs1.tampilkanInformasi();
    }
}

class Mahasiswa {
    public String nim;
    public String nama;
    public String kelas;
    public double ipk;

    public Mahasiswa() {
        // default constructor
    }

    public Mahasiswa(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    public void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
    }

    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }
}
