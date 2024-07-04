package pbo;

public class Sepatu {
        //atribute dan encaptulation
    private String merek;
    private String kodebarang;
    
    //constructor
    public Sepatu(String merek, String kodebarang) {
        this.merek = merek;
        this.kodebarang = kodebarang;
    }
    
    //mutator (setter)
    public void setMerek(String merek) {
        this.merek = merek;
    }
    
    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }
    
    //acessor
    public String getMerek(){
        return merek;
    }
    
    public String getKodebarang() {
        return kodebarang;
    }
    
    public String displayInfo() {
        return "Merek Sepatu         : "+getMerek()+"\nKode  Barang         : "+getKodebarang();
    }
    
    //polymorphism (overloading)
    public String displayInfo (String kondisi) {
        return displayInfo ()+ "     Kondisi : "+kondisi;
    }
}