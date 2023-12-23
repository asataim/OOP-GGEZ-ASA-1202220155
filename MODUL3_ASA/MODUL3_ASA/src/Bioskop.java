public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    public static final int rows = 5;
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    public static final int seats_per_rows = 10;
    // TO DO: Create 2 dimensional array to store seat reservation status
    public int [][] store_seat_res = new int [rows][seats_per_rows];
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        // this.store_seat_res = store_seat_res;
        store_seat_res[0][2]=1;
        store_seat_res[1][5]=1;
        store_seat_res[3][7]=1;
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("Booking Tiket Bioskop: ");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<seats_per_rows; j++) {
                System.out.println(store_seat_res[i][j] + " ");
            }
        }
    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int rows, int seat) {
        if (store_seat_res[rows][seats_per_rows] == 0){
            store_seat_res[rows][seats_per_rows] = 1;
            System.out.println("Kursi berhasil dipesan");
        
        }else{ 
            System.out.println("Kursi gagal dipesan");
        }
    }
}