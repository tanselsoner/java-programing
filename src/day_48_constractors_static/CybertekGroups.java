package day_48_constractors_static;


import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        //dependency injection.group object creation depends on string name
        Group group1 = new Group("Cyberbugs");
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");
        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());
     Group group2 = new Group("CyberCats");
     group2.setMembers(Arrays.asList("Stephen","Wakshum","Akrem","Bulent","Andreea","Andrei"));
     //Print all members not toString()
        System.out.println("group2 members = " + group2.getMembers());
        //use if statement to check Akrem is in the group
        if(group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is a member of group2");
        }else{
            System.out.println("Akram is not a member");
        }

    }
}
