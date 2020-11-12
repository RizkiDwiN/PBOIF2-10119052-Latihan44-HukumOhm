
package pboif2.pkg10119052.latihan44.hukumohm;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Hukum ohm berbasis objek
 * 
 */
public class Baterai {
    private float kuatArus,hambatan;

    public float getKuatArus() {
        kuatArus = 3;
        return kuatArus;
    }

    public float getHambatan() {
        hambatan =12 ;
        return hambatan;
    }
    
  
    public float hitungtegang(){
        return kuatArus*hambatan;
        
    }
    
   public void baterai(){
       System.out.println("=====Hukum Ohm=====");
       System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar akan berbanding lurus dengan potensial"
               +"pada ujung-ujung kawat pengantar tersebut asalkan suhu kawat di jaga konstan");
       System.out.println("Kuat arus : "+getKuatArus()+" ampere");
       System.out.println("Hambatan : "+getHambatan()+" ohm");
       System.out.println("Hasil Tegangan : "+hitungtegang()+" volt");
       
       
       
   }
}
