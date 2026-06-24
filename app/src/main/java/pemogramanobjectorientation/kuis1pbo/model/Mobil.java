package pemogramanobjectorientation.kuis1pbo.model;

import pemogramanobjectorientation.kuis1pbo.enums.JenisKendaraan;

public class Mobil  extends Kendaraan {
    private String nomorpolisi, model,jenisBahakanBakar;
    private int kapasitas;
    public Mobil(String nomorpolisi, String model,String jenisBahakanBakar,int kapasitas){
        super(JenisKendaraan.MOBIL);
        this.nomorpolisi = nomorpolisi;
        this.model = model;
        this.jenisBahakanBakar = jenisBahakanBakar;
        this.kapasitas = kapasitas;
    }
    @Override
    public String getPrintDetail() {
        String detail = "Tipe Kendaraan : " + getKendaran() + "\n" +
                "Nomor Polisi : " + nomorpolisi + "\n" +
                "Model : " + model + "\n" +
                "Kapasitas : " + kapasitas + "\n" +
                "JenisBahanBakar : " + jenisBahakanBakar;
                
        return detail;
        
       
       
    }
    


   
    
}
