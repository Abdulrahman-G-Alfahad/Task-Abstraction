import java.util.ArrayList;
import java.util.Arrays;

public class Teacher extends Person{
    private String subject;
    private String school;
    private ArrayList<Student> students;

    public Teacher(String name, String subject, String school, ArrayList<Student> students) {
        super(name);
        this.subject = subject;
        this.school = school;
        this.students = students;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void removeStudents(Student student) {
        students.remove(student);
    }

    @Override
    void describeRole() {
        System.out.println(super.getName() + " is a teacher of " + getSubject() + " at " + getSchool() + " and teaches these students: " + students.toString());
    }
}
