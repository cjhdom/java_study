package daebaksong.org.firstProject;

// DTO : Data transfer object
public class HelloDTO {
    private String name; // field, variable in a class
    private int age;

    // name property
    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // name property
    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
