public class Mahasiswa02 {

    // ATRIBUT (data mahasiswa)
    String nim;
    String nama;
    String kelas;
    double ipk;

    // CONSTRUCTOR DEFAULT
    public Mahasiswa02() {
    }

    // CONSTRUCTOR BERPARAMETER
    public Mahasiswa02(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    // METHOD MENAMPILKAN DATA
    void tampilkanInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("Nilai Kinerja : " + nilaiKinerja());
        System.out.println("-----------------------");
    }

    // METHOD UBAH KELAS
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    // METHOD UPDATE IPK (dengan validasi)
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 - 4.0");
        }
    }

    // METHOD NILAI KINERJA
    String nilaiKinerja() {
        if (ipk >= 3.5) return "Sangat Baik";
        else if (ipk >= 3.0) return "Baik";
        else if (ipk >= 2.5) return "Cukup";
        else return "Kurang";
    }
}