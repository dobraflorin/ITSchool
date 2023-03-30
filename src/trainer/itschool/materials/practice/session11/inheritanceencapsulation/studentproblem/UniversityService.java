package ro.itschool.practice.session11.inheritanceencapsulation.studentproblem;

public class UniversityService {

    public static void main(String[] args) {
        Student studentMaria = new Student();
        System.out.println(studentMaria.getFirstName());
        studentMaria.setFirstName("Maria");
        System.out.println(studentMaria.getFirstName());
    }
}