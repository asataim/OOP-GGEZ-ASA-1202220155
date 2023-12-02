public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi eks1 = new Ekspedisi(10, "Jakarta", 10000);
        eks1.informasi();
        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress telu1 = new TelUExpress(100, "Bandung", 50000,true);
        telu1.informasi();
        telu1.ambil("Sukabirus");
        telu1.antar(1328689);
        telu1.antar(1922722,7628262);
        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress fri1 = new FRIExpress(30, "Bojongsoang", 70000,false);
        fri1.informasi();
        fri1.terima(2000);
        fri1.kirim("lembang");
        fri1.kirim("lembang","Rancaekek");

    }
}
