import java.util.*;

public class FormulirData {
    private String namaLengkap;
    private String alamat;
    private String telepon;

    public FormulirData() {
        inputData();
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Lengkap: ");
        this.namaLengkap = scanner.nextLine();

        System.out.print("Alamat: ");
        this.alamat = scanner.nextLine();

        System.out.print("Nomor Telepon: ");
        this.telepon = scanner.nextLine();
    }

    public List<String> getDataList() {
        List<String> data = new ArrayList<>();
        data.add(namaLengkap);
        data.add(alamat);
        data.add(telepon);
        return data;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }
}
