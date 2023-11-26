public class Kendaraan {
    private String nomorIdentifikasi;
    private double kecepatanMaksimum;
    private int kapasitasPenumpang;

    public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang){
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String toString(){
        return "\nNomor Identifikasi = " + nomorIdentifikasi +
                "\nKecepatan Maksimum = " + kecepatanMaksimum +
                "\nKapasitas Maksimum = " + kapasitasPenumpang;
    }

    public void info(){
        System.out.println("Nomor Identifikasi = " + nomorIdentifikasi);
        System.out.println("Kecepatan Maksimum = " + kecepatanMaksimum);
        System.out.println("Kapasitas Maksimum = " + kapasitasPenumpang);
    }

    public double hitungWaktuTempuh(double jarak){
        return jarak / kecepatanMaksimum;
    }
}