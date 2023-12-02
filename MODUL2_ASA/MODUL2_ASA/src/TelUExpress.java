public class TelUExpress extends Ekspedisi
{
    // TO DO: Create Protected Atribute of TelUExpress(antarInter)
    protected boolean antarinter;

    public TelUExpress(int jumlahCabang, String pusat, float tarif, boolean antarinter) {
        super(jumlahCabang, pusat, tarif);
        this.antarinter = antarinter;
    }

    // TO DO: Create Constructor of TelUExpress

    // TO DO: Create 'informasi' Method to show Information
    @Override
    public void informasi() {
        if (antarinter == true) {
            System.out.println("Ekspedisi TELUExpress dengan jumlah cabang "+ jumlahCabang+" dan berpusat di "+pusat+" mempunyai tarif sebesar Rp."+tarif+".0 perkilogram. Selain itu, ekspedisi ini melayani pengantaran internasional");
            
        }
        else{
            System.out.println("Ekspedisi TELUExpress dengan jumlah cabang "+ jumlahCabang+" dan berpusat di "+pusat+" mempunyai tarif sebesar Rp."+tarif+".0 perkilogram. Selain itu, ekspedisi ini tidak melayani pengantaran internasional");

        }
    }
    // TO DO: Create 'ambil' Method to pick up a package
    public void ambil(String tempat) {
        System.out.println("TELUExpress berhasil mengambil paket ke "+tempat);
    }
    // TO DO: Create 'antar' Method to send a package
    public void antar(int resi) {
        System.out.println("TELUExpress berhasil mengantar paket dengan no resi"+resi);
    }
    // TO DO: Create 'antar' Method to send two packages
    public void antar(int resi_1,int resi_2) {
        System.out.println("TELUExpress berhasil mengantar paket dengan no resi"+resi_1+" dan "+resi_2);
    }
}
