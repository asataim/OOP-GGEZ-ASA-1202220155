public class Cashier extends Bioskop {

    
    // TO DO : Create a method to print ticket
    public void printTicket(User user) {
        boolean isBooked = false;
        for (int i = 0; i < super.store_seat_res.length; i++){
            for (int j = 0; j < super.store_seat_res[i].length; j++){
                if (!((i ==0 && j == 2) || (i == 1 && j == 5 ) || (i == 3 && j == 7))){
                    if (super.store_seat_res[i][j] == 1){
                        isBooked = true;
                        System.out.println("=================================");
                        System.out.println("Nama : ");
                        System.out.println("Phone   :");
                        System.out.println("=================================");
                    }

                }            
            }
        }
    }

    
}

