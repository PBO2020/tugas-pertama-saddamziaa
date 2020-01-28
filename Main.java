package kalkulator;

public class Main {
         
    public static void main(String[]args){
        System.out.println("Penjumlahan");
        Kalkulator jumlah = new Kalkulator();
        jumlah.setangka1(10);
        jumlah.setangka2(5);
        jumlah.setTambah(jumlah.getangka1() + jumlah.getangka2());
        System.out.println(jumlah.getangka1()+ " + " +jumlah.getangka2()+ " = " + jumlah.getTambah());

        
        System.out.println("");
        
        System.out.println("Pengurangan");
        Kalkulator kurang = new Kalkulator();
        kurang.setangka1(10);
        kurang.setangka2(5);
        kurang.setTambah(kurang.getangka1() - kurang.getangka2());
       System.out.println(jumlah.getangka1()+ " - " +jumlah.getangka2()+ " = " + jumlah.getTambah());
        
        System.out.println("");
        
        System.out.println("Perkalian");
        Kalkulator kali = new Kalkulator();
        kali.setangka1(10);
        kali.setangka2(5);
        kali.setTambah(kali.getangka1() * kali.getangka2());
        System.out.println(jumlah.getangka1()+ " * " +jumlah.getangka2()+ " = " + jumlah.getTambah());
        
        System.out.println("");
        
        System.out.println("Pembagian");
        Kalkulator bagi = new Kalkulator();
        bagi.setangka1(10);
        bagi.setangka2(5);
        bagi.setTambah(bagi.getangka1() / bagi.getangka2());
        System.out.println(jumlah.getangka1()+ " : " +jumlah.getangka2()+ " = " + jumlah.getTambah());
    }
}
