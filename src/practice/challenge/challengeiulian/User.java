package practice.challenge.challengeiulian;

public class User {
    private String id;
    private String firstName;
    private String secondName;
    private String email;

    public String getId() {
        return id;

    }

    final public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
