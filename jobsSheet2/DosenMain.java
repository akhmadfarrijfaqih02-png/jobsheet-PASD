public class DosenMain {
    public static void main(String[] args) {

        // OBJECT 1
        Dosen d1 = new Dosen();
        d1.idLecturer = "D001";
        d1.name = "Pak Budi";
        d1.activeStatus = true;
        d1.yearOfEntry = 2015;
        d1.expertiseCompetency = "AI";

        d1.showInformation();

        // OBJECT 2
        Dosen d2 = new Dosen("D002", "Bu Sari", true, 2010, "Database");
        d2.showInformation();

        // METHOD
        d1.setStatusActive(false);
        d1.changeSkill("Machine Learning");

        int lamaKerja = d1.calculateTimeWork(2025);
        System.out.println("Masa kerja: " + lamaKerja + " tahun");

        d1.showInformation();
    }
}
