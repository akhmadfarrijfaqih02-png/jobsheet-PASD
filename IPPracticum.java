 import java.util.Scanner;

public class IPPracticum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah MK: ");
        int n = input.nextInt();

        String[] nama = new String[n];
        int[] sks = new int[n];
        char[] nilai = new char[n];

        double totalBobot = 0;
        int totalSKS = 0;

        for(int i = 0; i < n; i++) {
            input.nextLine();

            System.out.print("Nama MK: ");
            nama[i] = input.nextLine();

            System.out.print("SKS: ");
            sks[i] = input.nextInt();

            System.out.print("Nilai Huruf: ");
            nilai[i] = input.next().charAt(0);

            double setara = 0;

            switch(nilai[i]) {
                case 'A': setara = 4; break;
                case 'B': setara = 3; break;
                case 'C': setara = 2; break;
                case 'D': setara = 1; break;
                case 'E': setara = 0; break;
            }

            totalBobot += setara * sks[i];
            totalSKS += sks[i];
        }

        double IP = totalBobot / totalSKS;
        System.out.println("IP Semester: " + IP);
    }
}
    
 