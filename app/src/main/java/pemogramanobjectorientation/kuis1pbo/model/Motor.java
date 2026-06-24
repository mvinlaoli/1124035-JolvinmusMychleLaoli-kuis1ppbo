package pemogramanobjectorientation.kuis1pbo.model;

import pemogramanobjectorientation.kuis1pbo.enums.JenisKendaraan;

public class Motor extends Kendaraan {
    private String nomorpolisi, model;
    public Motor(String nomorpolisi, String model){
        super(JenisKendaraan.MOTOR);
        this.nomorpolisi = nomorpolisi;
        this.model = model;
    }
    @Override
    public String getPrintDetail() {
        String detail = "Tipe Kendaraan : " + getKendaran() + "\n" +
                "Nomor Polisi : " + nomorpolisi + "\n" +
                "Model : " + model;
        return detail;
    }
   
   
   
    

  
    
    
}
