package day_48_constractors_static;

public class Customer {
    private String name;
    private int id;

    public Customer(){
        System.out.println("No_args constructor");
        name="new customer";
        id=-1;
    }

    public String getName() {
        return name;
    }
//add a Constructor where we can assign name and id
    public Customer(String name,int id){
        System.out.println("2-args constructor");
        this.name=name;//setName(name);
        this.id = id;//setId(id);when we have some conditions in setter reuse that condition here
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
