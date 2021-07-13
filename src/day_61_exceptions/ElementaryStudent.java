package day_61_exceptions;

public class ElementaryStudent {
    private String name;
    private int age;

    public ElementaryStudent(){}

    public ElementaryStudent(String name, int age) {
        setName(name);
        setAge(age);

    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
         //check if the name is null first otherwise we might get null pointer exception
        throw new IllegalArgumentException("Name cannot be empty or null");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<5 || age>12){
            throw new IllegalArgumentException("age cannot be <5 or >12");

        }
        this.age = age;
    }
}
