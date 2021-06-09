package day_51_inheritance;

public class Contractor extends Employee {
    @Override //1)lets everyone knows you are overriding
              //2)ensures that this method is being overridden.if not it shows error
    public double calculateSalary(double hourlyRate){
       return 50 * 40 * hourlyRate;


    }
}
