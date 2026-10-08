import java.util.Scanner;
public class studiKasus2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama;
        String kegiatan ;
        int dokumen;
        int juara ;
        int status;
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

        if (kegiatan.equalsIgnoreCase("BELMAWA") || kegiatan.equalsIgnoreCase("BAKORMA") || kegiatan.equalsIgnoreCase("MANDIRI")) {
            if (juara >= 1 && juara <=3) {
                if(dokumen >=4){
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan");
                }
                else if (dokumen >=3){
                    System.out.println("Status : Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan");
                }
                else if (dokumen ==2){
                    System.out.println("Status : Dokumen tidak lengkap (kurang 2 dokumen). Dana penghargaan tidak diberikan");
                }
                else if (dokumen ==1){
                    System.out.println("Status : Dokumen tidak lengkap (kurang 3 dokumen). Dana penghargaan tidak diberikan");
                }
                else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang 4 dokumen). Dana penghargaan tidak diberikan");
                }
            } 
            else {
                System.out.println("Status : Peringkat juara tidak valid. Dana penghargaan tidak diberikan");
            }
        } else if (kegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM(1=lolos,0=tidak lolos): ");
            status = scanner.nextInt();
            if ( status ==1) {
                if(dokumen >=4){
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan");
                }
                else if (dokumen ==3){
                    System.out.println("Status : Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan");
                }
                else if (dokumen ==2){
                    System.out.println("Status : Dokumen tidak lengkap (kurang 2 dokumen). Dana penghargaan tidak diberikan");
                }
                else if (dokumen ==1){
                    System.out.println("Status : Dokumen tidak lengkap (kurang 3 dokumen). Dana penghargaan tidak diberikan");
                }
                else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang 4 dokumen). Dana penghargaan tidak diberikan");
                }
                
            } else {
                System.out.println("Status : Tidak lolos pendanaan. Dana penghargaan tidak diberikan");
            }
        } else {
            System.out.println("Status : Kegiatan lainnya tidak memperoleh dana pendanaan. Dana penghargaan tidak diberikan");
        }
    }
}
