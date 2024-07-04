package pbo;

import java.util.Scanner;

public class SepatuBeraksi {
    public static void main(String[] args) {
        //objek
        //Sepatu spt = new Sepatu("Adidas","0001");
        
        //System.out.println(spt.displayInfo());
        //System.out.println(spt.displayInfo("baru"));
        
        //erro handdling
        try{
                //IO sederhana
                Scanner scanner = new Scanner (System.in);
                
                //array
                SepatuDetail[]spt = new SepatuDetail[3];
                
                //perulangan
                for(int i=0; i<spt.length; i++){
                System.out.print("Masukkan Merek Sepatu "+(i+1)+": ");
                String merek = scanner.nextLine();
                System.out.print("Masukkan Kode Barang "+(i+1)+": ");
                String kodebarang = scanner.nextLine();
                
                //objek
                spt[i] = new SepatuDetail (merek, kodebarang);     
                }
                
                //perulangan
                for (SepatuDetail data: spt) {
                    System.out.println("               ");
                    System.out.println("##########################");
                    System.out.println("Data Sepatu");
                    System.out.println(data.displayInfo());  
                }
        }catch (NumberFormatException e){
            System.out.println("Kesalahan Format Angka Barang: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Kesalahan Umum: "+e.getMessage());
        }   
    }
}
