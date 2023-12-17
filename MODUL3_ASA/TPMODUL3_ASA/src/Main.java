import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        try {
            ArrayList<String> courseInfo = new ArrayList<>();
            courseInfo.add("Course ID: 100,\nCourse Name: Statistika Industri\n -Student: Haris\n -Student: Metta");
            courseInfo.add("Course ID: 101,\nCourse Name: Desain Jaringan Komputer\n -Student: Windy\n -Student: Amilia");

            Teacher teacher = new Teacher("Pak Yoga", 1);

            Admin admin = new Admin("Hudza", 2);

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();

            Student student = new Student(name, id);
            
            scanner.nextLine(); 
            System.out.print("Enter courses to enroll in (separated by comma): ");
            String courses = scanner.nextLine();

            student.enrollInCourses(courses);
            
            System.out.println(" ");
            System.out.println(courseInfo.get(0));
            System.out.println(" ");
            System.out.println(courseInfo.get(1));
            System.out.println(" ");
            System.out.println(student.getUserDetail());
            System.out.println(" ");
            teacher.teachClass(" is teaching Math");
            admin.manageSystem(" is managing the university system");

            }catch (Exception e) {
                System.out.println("Invalid input. please enter a valid integer for student id");
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
    }
}

