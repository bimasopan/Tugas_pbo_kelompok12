import java.util.*;
public class FormulirPendaftaran implements method{
    public String Nama,Alamat,NoTelepon;
    private List<String>data;
    private boolean dataLengkap = true;
    private int BiayaPendaftaran = 15000;
    //Method Constructor
    public FormulirPendaftaran(String nama,String Alamat,String NoTelepon,int bayar){
        this.Nama=nama;
        this.Alamat=Alamat;
        this.NoTelepon=NoTelepon;
        BayarBiayaPendaftaran(bayar);
        this.data=listDaftar(nama, Alamat, NoTelepon);
    }
    public List<String>listDaftar(String nama, String alamat, String noTelepon){
        ArrayList<String>data = new ArrayList<>();
        data.add(nama);
        data.add(alamat);
        data.add(noTelepon);
        return data;
    }
    public List<String>getData(){
        return data;
    }
    @Override
    public boolean isBerkasLengkap(){
        for (String a : getData()){
            if (a.isEmpty()){
                dataLengkap = false;
                break;
            }
        }
        return dataLengkap;
    }
    @Override
    public boolean BayarBiayaPendaftaran(int bayar) {
        if (bayar >= BiayaPendaftaran){
            System.out.println("Sudah bayar pendaftaran");
            return true;
        }else{
            System.out.println("belum bayar pendaftaran");
            return false;
        }
    }
}
