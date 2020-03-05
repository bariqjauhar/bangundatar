package bangundatar;

public class Main {
    public static void main(String[] args) {

//        silinder Silinder = new silinder();
//        silinder.setRadius(5);
//        System.out.println(Silinder.volume());
        lingkaran Lingkaran = new lingkaran();
        System.out.println("----luas lingkaran---- ");
        System.out.println( "luas lingkaran : "+ Lingkaran.luas(7));
        System.out.println("keliling lingaran : " + Lingkaran.keliling(7));


//        persegipanjang Persegipanjang = new persegipanjang();
//        System.out.println("----persegi panjang----");
//        System.out.println("luas persegi panjang : "+Persegipanjang.luas(4, 6));
//        System.out.println("keliling persegi panjang : "+Persegipanjang.keliling(4, 6));
        balok Balok = new balok();
        System.out.println("----persegi panjang----");
        System.out.println("luas persegi panjang : "+Balok.luas(5,6));
        System.out.println("keliling persegi panjang : "+Balok.keliling(5,6));
        System.out.println("volume balok : "+Balok.volume(5));


//        persegi Persegi = new persegi();
//        System.out.println("----persegi----");
//        System.out.println("luas persegi : " + Persegi.luas(10));
//        System.out.println("keliling persegi : " + Persegi.keliling(20));

        kubus Kubus = new kubus();
        System.out.println("----persegi----");
        System.out.println("luas persegi : " +Kubus.luas(5));
        System.out.println("keliling persegi : " +Kubus.keliling(5));
        System.out.println("volume kubus : "+Kubus.volume());



        segitiga Segitiga = new segitiga();
        System.out.println("----luas segitiga----");
        System.out.println("luas segitiga : " + Segitiga.luas(4, 6));
        System.out.println("keliling segitiga : " + Segitiga.keliling(4));


//        persegi Persegi = new persegi();
//
//        System.out.println(Persegi.luas(5));
//        System.out.println(Persegi.keliling(5));

       /*bangundatar Bangundatar = new bangundatar();
        Bangundatar.luas();
        Bangundatar.setJenis("persegi");
        System.out.println(Bangundatar.getJenis());
        // TODO code application logic here*/

    }

}
