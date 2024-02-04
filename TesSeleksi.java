import java.util.Scanner;

public class TesSeleksi {
    private FormulirPendaftaran formulirPendaftaran;

    public TesSeleksi(FormulirPendaftaran formulirPendaftaran) {
        this.formulirPendaftaran = formulirPendaftaran;
    }

    public void tanyakanHasilSeleksi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah kamu lulus seleksi (ya/tidak)? ");
        String jawab = scanner.nextLine().toLowerCase();

        if (jawab.equals("ya")) {
            System.out.println("Selamat, kamu diterima!");
        } else {
            System.out.println("Maaf, kamu tidak diterima.");
        }
    }
