public class Dosen {

    // ATRIBUT
    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    // CONSTRUCTOR DEFAULT
    public Dosen() {
    }

    // CONSTRUCTOR PARAMETER
    public Dosen(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    // METHOD TAMPILKAN DATA
    void showInformation() {
        System.out.println("ID Dosen : " + idLecturer);
        System.out.println("Nama : " + name);
        System.out.println("Status Aktif : " + activeStatus);
        System.out.println("Tahun Masuk : " + yearOfEntry);
        System.out.println("Keahlian : " + expertiseCompetency);
        System.out.println("----------------------");
    }

    // METHOD UBAH STATUS
    void setStatusActive(boolean status) {
        activeStatus = status;
    }

    // METHOD HITUNG MASA KERJA
    int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    // METHOD UBAH KEAHLIAN
    void changeSkill(String skill) {
        expertiseCompetency = skill;
    }
}
