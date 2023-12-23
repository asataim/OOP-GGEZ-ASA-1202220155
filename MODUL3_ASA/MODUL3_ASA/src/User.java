public class User {
   
   // TO DO: Create Private Attributes of User (nama, noHandphone)
   public String name;
   public String noHandphone;
   
   
   // TO DO: Create Constructor of User
   public User(String name, String noHandphone) {
      this.name = name;
      this.noHandphone = noHandphone;
   }

   // TO DO: Create register Method to show information about name and phone number
   public void register(){
      System.out.println("Nama : "+ name + "\nNo Handphone: "+ noHandphone); 
    }
   
    // TO DO: Create method to return name and phone number
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getNoHandphone() {
      return noHandphone;
   }

   public void setNoHandphone(String noHandphone) {
      this.noHandphone = noHandphone;
   }



}






  