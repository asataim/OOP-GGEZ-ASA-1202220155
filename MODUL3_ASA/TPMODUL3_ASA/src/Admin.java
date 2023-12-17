public class Admin extends User{

    public Admin(String name, int id) {
        super(name, id);
    }
    
    public void manageSystem(String task) {
        System.out.println(name + task);
    }

    @Override
    public String getUserDetail() {
        return super.getUserDetail() + ", Admin";
    }

}