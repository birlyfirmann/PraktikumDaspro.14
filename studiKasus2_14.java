import java.util.Scanner;
public class studiKasus2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama;
        String kegiatan ;
        int dokumen;
        int juara ;
        System.out.print("Nama Mahasiswa : ");
        nama = scanner.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/LAINNYA): ");
        kegiatan = scanner.nextLine();
        System.out.print("Jumlah dokumen : ");
        dokumen = scanner.nextInt();
        System.out.print("Peringkat juara : ");
        juara = scanner.nextInt();
        scanner.close();
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Jenis kegiatan : " + kegiatan);
        System.out.println("Jumlah dokumen : " + dokumen);
        System.out.println("Peringkat juara : " + juara);
    }
}
