package pemogramanobjectorientation.kuis1pbo.utility;
import pemogramanobjectorientation.kuis1pbo.enums.JenisKendaraan;
import pemogramanobjectorientation.kuis1pbo.model.Helikopter;
import pemogramanobjectorientation.kuis1pbo.model.Kapal;
import pemogramanobjectorientation.kuis1pbo.model.Kendaraan;
import pemogramanobjectorientation.kuis1pbo.model.Mobil;
import pemogramanobjectorientation.kuis1pbo.model.Motor;



public class KendaraanFactory {
    public static Kendaraan createKendaraan(String nomorpolisi,String model){
        return new Motor(nomorpolisi, model);
    }
    public static Kendaraan createKendaraan(String nomorpolisi,String model,String jenisbahanbakar,int kapasitas){
      return new Mobil(nomorpolisi, model, jenisbahanbakar, kapasitas);
    }
    public static Kendaraan createKendaraan(int kapasitas,String pengunaan){
       return new Helikopter(kapasitas, pengunaan);
    }
    public static Kendaraan createKendaraan(int lebar, int panjang, String jenis,int kapasitas){
       return new Kapal(lebar, panjang, jenis, kapasitas);
    }
    
}
