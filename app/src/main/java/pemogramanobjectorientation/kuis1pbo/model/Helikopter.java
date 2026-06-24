package pemogramanobjectorientation.kuis1pbo.model;

import pemogramanobjectorientation.kuis1pbo.enums.JenisKendaraan;

public class Helikopter  extends Kendaraan{
    private int kapasitas;
    private String penguunaan;
    public Helikopter(int kapasitas, String penggunan){
        super(JenisKendaraan.HELIKOPTER);
        this.kapasitas = kapasitas;
        this.penguunaan = penggunan;
    }
    @Override
    public String getPrintDetail() {
         String detail = "Tipe Kendaraan : " + getKendaran() + "\n" +
                "Kapasitas : " + kapasitas + "\n" +
                "Pengunnan : " + penguunaan;
        return detail;
       
    }
    
    
}
