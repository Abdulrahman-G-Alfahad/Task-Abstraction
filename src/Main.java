import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student ibrahim = new Student("Ibrahim", "Coded");
        Student abdulrahman = new Student("Abdulrahman","Coded");
        Teacher ali = new Teacher("Ali","Backend","Coded", new ArrayList<Student>(Arrays.asList(ibrahim,abdulrahman)));
        ali.describeRole();
    }
}