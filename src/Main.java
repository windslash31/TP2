import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        //deklarasi dan scnaner
        int a, b, c, d, e, f, i;
        int faktorial = 1;
        Scanner input = new Scanner(System.in);
        boolean condition = true;

        //greetings
        while (condition)
            {
            System.out.println("BELAJAR DERET ARITMATIKA, GEOMETRI DAN MENGHITUNG FAKTORIAL");

            //menerima input user

            System.out.print("Masukkan banyak angka yang mau dicetak [2 . . 10] : ");
            a = input.nextInt(); //angka yang mau dicetak dengan range 2 - 10
            while (a < 2 || a > 10) {
                System.out.print("Tolong masukan angka yang sesuai : "); //jika user memasukan angka yang tidak sesuai dengan syarat diatas, mengulang pertanyaan dan menunggu input sesuai
                a = input.nextInt();
            }
            System.out.print("Masukkan beda masing-masing angka [2..9] : ");
            b = input.nextInt(); //angka dengan range 2-9
            while (b < 2 || b > 9) {
                System.out.print("Tolong masukan angka yang sesuai : ");
            }

            //menampilkan hasil

            System.out.println("Deret Aritmatik    :");
            c = 1;
            i = 1;
            while (i <= a) {
                System.out.print(c + " ");
                i++;
                c += b;
            }
            System.out.println("");

            //deret geometri
            System.out.println("Deret Geometri   :");
            d = 1;
            i = 1;
            while (i <= a) {
                System.out.print(d + " ");
                i++;
                d *= b;
            }
            System.out.println("");
            //faktorial
            for(int n = 1; n<=b; n++){
                faktorial = n * faktorial;
            }
            System.out.println("Hasil Faktorial dari " + b + " adalah : " + faktorial);

            System.out.println("Anda Mau Ulang ? (y/t)");
            String judge = new Scanner(System.in).next();
            if (judge.equals("t")) {
                condition = false;
            }else if (judge.equals("y")) {
                condition = true;
            }else {
                continue;
            }
        }
    }
}