public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    
    private String Band_Name;
    private String Date;
    private String Location;
    private int Ticket_Price;
    public String getBand_Name() {
        return Band_Name;
    }
    public void setBand_Name(String band_Name) {
        Band_Name = band_Name;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }
    public String getLocation() {
        return Location;
    }
    public void setLocation(String location) {
        Location = location;
    }
    public int getTicket_Price() {
        return Ticket_Price;
    }
    public void setTicket_Price(int ticket_Price) {
        Ticket_Price = ticket_Price;
    }

    
}