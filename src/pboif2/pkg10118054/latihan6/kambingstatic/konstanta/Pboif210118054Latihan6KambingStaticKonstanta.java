/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118054.latihan6.kambingstatic.konstanta;

/**
 *
 * @author ASUS
 * nama  :Farhan Milardi
 * kelas :IF-2
 * NIM   :10118054
 */
public class Pboif210118054Latihan6KambingStaticKonstanta {

    /**
     * @param args the command line arguments
     */
    public static int jumlahKambing;
            
    public class KambingStatic {
        
        //NAMA_KAMBING sebagai konstanta
      public static final String NAMA_KAMBING = "MIDUN";
}
      public static void main(String[] arg) {
          Pboif210118054Latihan6KambingStaticKonstanta.jumlahKambing = 485000;
        String NAMA_KAMBING = "Midun";
          System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                             + Pboif210118054Latihan6KambingStaticKonstanta.jumlahKambing);
    }
    
}
