package pbo;

//inheritance
public class SepatuDetail extends Sepatu{
    //overriding
    public SepatuDetail (String merek, String kodebarang) {
        super(merek, kodebarang);
    }
    
    public String getJenisSepatu(){
        //seleksi if
        if ("01".equals(getKodebarang().substring(0, 2))){
            return "Running";
        } if ("02".equals(getKodebarang().substring(0, 2))){
            return "Sneakers";
        } if ("03".equals(getKodebarang().substring(0, 2))){
            return "Slip On";
        } else {
            return "Jenis Sepatu Tidak Diketahui";
        }
    }
    
    public int getBarangMasuk(){
        return Integer.parseInt(getKodebarang().substring(2));
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nJenis Sepatu         : "+getJenisSepatu()+
                "\nNomor Barang Masuk   : "+getBarangMasuk();
    }   
}