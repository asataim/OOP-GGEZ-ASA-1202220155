public class MainApp {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("A1", 100, 1000); 
        System.out.println("Kendaraan : " + kendaraan);

        Mobil mobil = new Mobil("B1", 500, 4, 4);
        System.out.println("\nInformasi Mobil : " + mobil);

        Mobil mobil2 = new Mobil("B2", 1000, 6, 4);
        System.out.println("\nInformasi Mobil2 : " + mobil2);

        Bus bus = new Bus("C1", 5000, 100, 50);
        System.out.println("\nInformasi Bus : ");
        bus.info();


    }
}