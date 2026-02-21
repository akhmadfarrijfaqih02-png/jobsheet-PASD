public class MataKuliah {

    // ATRIBUT
    String kodeCourse;
    String name;
    int sks;
    int numberOfHours;

    // CONSTRUCTOR DEFAULT
    public MataKuliah() {
    }

    // CONSTRUCTOR PARAMETER
    public MataKuliah(String kodeCourse, String name, int sks, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;
        this.sks = sks;
        this.numberOfHours = numberOfHours;
    }

    // METHOD MENAMPILKAN DATA
    void showInformation() {
        System.out.println("Kode Course : " + kodeCourse);
        System.out.println("Nama Course : " + name);
        System.out.println("SKS : " + sks);
        System.out.println("Jam Pertemuan : " + numberOfHours);
        System.out.println("--------------------------");
    }

    // METHOD UBAH SKS
    void updateSKS(int sksNew) {
        sks = sksNew;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    // METHOD TAMBAH JAM
    void addHour(int hours) {
        numberOfHours += hours;
        System.out.println("Jam berhasil ditambah. Total: " + numberOfHours);
    }

    // METHOD KURANGI JAM
    void reduceHours(int hours) {
        if (numberOfHours >= hours) {
            numberOfHours -= hours;
            System.out.println("Jam berhasil dikurangi. Sisa: " + numberOfHours);
        } else {
            System.out.println("Jam tidak cukup untuk dikurangi!");
        }
    }
}