import java.util.Scanner;

public class percabangan {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int nilai;
        String keterangan;
        System.out.print("Masukkan nilainya : ");
        nilai = scan.nextInt();
        if ( nilai >= 60){
            keterangan = "Lulus";
        }else{
            keterangan = "Tidak Lulus";
        }

        System.out.println("nilai anda adalah " + nilai + " keterangan " + keterangan);
    }
}
