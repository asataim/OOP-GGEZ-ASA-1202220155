import java.util.List;
import java.util.ArrayList;

public class Database {

    // TODO: Create List of Konser Object to Store Konser from Konser Class
    List<Konser> konser_object = new ArrayList<>();

    // TODO: Create Method to insert Konser to Database
    public void insert(Konser namakonser) {
        konser_object.add(namakonser);
    }

    // TODO: Create Method to Show Konser from Database
    public void show(Konser namakonser) {
        System.out.println("Konser yang tersedia : " + namakonser.getBand_Name() + " tanggal konser : " + namakonser.getDate() + " Lokasi : " + " Harga tiket : " + namakonser.getTicket_Price());
    }

    // TODO: Create Method to Buy Ticket and Show the Total Price
    public void Transaction(int jumlah_tiket, int total_harga) {
        
        Konser 
        System.out.println("Total harga pembelian : " + jumlah_tiket * Register.getTicket_Price());
    }
}
