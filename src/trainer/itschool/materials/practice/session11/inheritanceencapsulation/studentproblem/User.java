package ro.itschool.practice.session11.inheritanceencapsulation.studentproblem;

public class User {

    private String firstName;
    private String lastName;
    private int age;


    //getter method
    public String getFirstName() {
        return firstName;
    }

    //setter method
    public void setFirstName(String firstName) {
        if (firstName.length() <= 3) {
            System.out.println("Invalid first name!");
        } else {
            this.firstName = firstName;
        }
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}