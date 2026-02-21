public class CourseMain {
    public static void main(String[] args) {

        // OBJECT 1 (constructor kosong)
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeCourse = "IF101";
        mk1.name = "Pemrograman Java";
        mk1.sks = 3;
        mk1.numberOfHours = 6;

        mk1.showInformation();

        // OBJECT 2 (constructor parameter)
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 4, 8);
        mk2.showInformation();

        // PANGGIL METHOD
        mk1.updateSKS(4);
        mk1.addHour(2);
        mk1.reduceHours(3);

        mk1.showInformation();
    }
}