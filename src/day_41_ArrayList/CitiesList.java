package day_41_ArrayList;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arraylist
        ArrayList<String> cities=new ArrayList<>();
        //add cities to array list-->add methods
        cities.add("Adana");//0
        cities.add("New York");//1
        cities.add("Bishkek");//2
        cities.add("Nicosia");//3
        cities.add(0,"Ashgabad");
        //add ashkabad first index
        //print all values same line
        System.out.println(cities);
        //print first and last
        System.out.println("first city = "+cities.get(0));
        System.out.println("last city = " +cities.get(4));
        //find last index using size-1
        System.out.println("last city = " +cities.get(cities.size()-1));
        System.out.println("last city = " +cities.get(cities.size()-2));
        System.out.println("count of items = "+cities.size());
        int size = cities.size();
        System.out.println(" there are size = " + size + " cities in the list");
        //for loop and print all values in same line
        for(int i =0; i<cities.size()/2;i++){// add / 2 after size it ll print half
            System.out.print(cities.get(i)+" ");}
            System.out.println();

            for(String city : cities){
                System.out.print(city + " ");
            }
            //delete item from arraylist
            //1) remove usin index.delete value in selected index
        cities.remove(3);
            //2) remove using object/value
        cities.remove("New York");
        System.out.println();

        System.out.println("after remove = " + cities);

        // delete all remove all values
        cities.clear();
        //make sure its clear
        //1) print |spit | out
        System.out.println("cities= " + cities);
        //2)using is empty
        if(cities.isEmpty()){
            System.out.println("list is empty");
        }
        //3) check size()==0
        if(cities.size()==0){
            System.out.println("list is empty");
        }



    }
}
