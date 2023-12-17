public class Teacher extends User {

    public Teacher(String name, int id) {
        super(name, id);
    }
    
    public void teachClass(String course) {
        super.getUserDetail();
        System.out.println(name + course);
    }
    @Override
    public String getUserDetail() {
        return super.getUserDetail() + ", Teacher";
    }

}