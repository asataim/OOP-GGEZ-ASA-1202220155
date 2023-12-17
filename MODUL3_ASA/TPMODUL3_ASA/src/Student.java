import java.util.ArrayList;

public class Student extends User {

    private ArrayList<String> enrolledCourses;

    public Student(String name, int id) {
        super(name, id);
        enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourses(String courseInput) {
        String[] courses = courseInput.split(",");
        for(String course : courses) {
            enrolledCourses.add(course.trim()); 
        }
    }
    
    @Override
    public String getUserDetail() {
        return "Student - " + super.getUserDetail() + "\nEnrolled Courses: " + enrolledCourses;
    }
}