package day_54_abstraction;

/**
 * -> we add abstract keyword to a class to make it an abstract class
 * ->we can not create object of a student class- meaning:
 * student student= new student will show error
 * ->we can extend this class by sub class
 * ->student class will be parent class for all other related classes
 */
public abstract class Student {
    public void code(String language){
        System.out.println("Student is coding using " + language);

    }
    /**
     * we can add abstract methods into abstract class.
     * 	abstract method -> is created using abstract keyword
     * 	and does not have the implementation/method body
     *
     * 	So abstract class only shows WHAT it can do, but not HOW by using abstract methods.
     */
    public abstract void attendClass();




    }

