public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute

    private String Name;
    private String Phone_Number;

    public void setName(String name) {
        Name = name;
    }
    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }


    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message

    public void Register() {
        System.out.println("Register untuk akun : ");
        System.out.println("Namamu adalah : " + Name );
        System.out.println("Nomor hp mu adalah : " + Phone_Number);
    }
}
