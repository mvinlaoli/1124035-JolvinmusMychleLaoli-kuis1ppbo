package pemogramanobjectorientation.kuis1pbo.model;

import pemogramanobjectorientation.kuis1pbo.enums.JenisKendaraan;

public class Kapal extends Kendaraan  {
    private int lebar,panjang,kapasitas;
    private String jenis;
    public Kapal(int lebar,int panjang,String jenis,int kapasitas){
        super(JenisKendaraan.KAPAL);
        this.lebar = lebar;
        this.panjang = panjang;
        this.jenis = jenis;
        this.kapasitas = kapasitas;
    }
    @Override
    public String getPrintDetail() {
        String detail = "Tipe Kendaraan : " + getKendaran() + "\n" +
                "Lebar : " + lebar + "\n" +
                "Panjang : " + panjang + "\n" +
                "Jenis : " + jenis + "\n" +
                "Kapastitas : " + kapasitas;
        return detail;
        
    }

    
}
