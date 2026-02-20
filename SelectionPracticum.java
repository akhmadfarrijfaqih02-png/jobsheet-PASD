 import java.util.Scanner;

public class SelectionPracticum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tugas, quiz, uts, uas, nilaiAkhir;
        char huruf;
        String status;

        System.out.print("Nilai Tugas: ");
        tugas = input.nextDouble();
        System.out.print("Nilai Quiz: ");
        quiz = input.nextDouble();
        System.out.print("Nilai UTS: ");
        uts = input.nextDouble();
        System.out.print("Nilai UAS: ");
        uas = input.nextDouble();

        if(tugas < 0 || tugas > 100 ||
           quiz < 0 || quiz > 100 ||
           uts < 0 || uts > 100 ||
           uas < 0 || uas > 100) {

            System.out.println("Invalid value");

        } else {

            nilaiAkhir = (0.2*tugas) + (0.2*quiz) +
                         (0.3*uts) + (0.3*uas);

            if(nilaiAkhir >= 85) huruf = 'A';
            else if(nilaiAkhir >= 80) huruf = 'B';
            else if(nilaiAkhir >= 70) huruf = 'C';
            else if(nilaiAkhir >= 60) huruf = 'D';
            else huruf = 'E';

            if(huruf == 'A' || huruf == 'B' || huruf == 'C')
                status = "PASS";
            else
                status = "NOT PASS";

            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + huruf);
            System.out.println("Status: " + status);
        }
    }
}
    
 
