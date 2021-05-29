package day_48_constractors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1=new Customer();
        System.out.println(cs1.toString());//print with default that are set in no-args constructor
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);
        Customer cs2= new Customer("Mike",2);//create object and assign value in same statement
        Customer cs3= new Customer("John Ward",473);
        System.out.println(cs2);
        System.out.println(cs3);
        //array of customers
        Customer[]todaysCustomers={cs1,cs2,cs3,new Customer("Bashir",449)};
        //arraylist customer objects
        List<Customer> customerList=new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir",449));
        customerList.add(new Customer("suleyman",9763));
        //Print info of first customer object in array and arraylist.
        System.out.println(todaysCustomers[0]);
        System.out.println(customerList.get(0).toString());
        System.out.println(customerList);//print toString() info all customer objects

        System.out.println("-----FOR LOOP-----");
        for(int i=0;i< customerList.size();i++){
            System.out.println(customerList.get(i));
        }

        System.out.println("----FOR EACH LOOP-----");

        for(Customer eachCustomer:customerList){
            System.out.println(eachCustomer);
        }

        //print all names of customers in the list
        System.out.println("---NAMES OF CUSTOMERS----");

        customerList.forEach(each-> System.out.println(each.getName()));
        for(Customer eachCustomer:customerList){
            System.out.println(eachCustomer.getName());
        }

        }




    }

