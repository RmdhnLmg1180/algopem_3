// Buat flowchart dan program yang dapat menampilkan  pola dibawah ini
// dengan jumlah garis sesuai dengan nilai n yang diinput bpengguna
//misal n = 5

// *    *
//  *  *
//    *
//  *  *
// *    *

// *  *
//   *
// *  * 
import java.util.Scanner;
public class tugas {
    private static Scanner sc;
    public static void main(String[]args) {
        sc = new Scanner(System.in);

        System.out.print("x = ");
        int rows = sc.nextInt();

        System.out.println("---- Printing X Pattern ------");

        int k = rows;

        for (int i = 0 ; i < k; i++ )
        {
            for (int j = 0 ; j < k; j++ )
            {
                if(j == i || i + j ==k -1)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

