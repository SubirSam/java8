@sam
public class Employee {
    private String name;
    private String id;
    private int age;

    public Employee() {
    }

    public Employee(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public static void display(){
        System.out.println("Hello everyone i am inside static method!!!!!");
    }
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
