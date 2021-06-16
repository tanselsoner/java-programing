package day_54_abstraction;

public class School {
    public static void main(String[] args) {
       // Student student = new Student();ERROR--cannot create of student
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();



            }
        }


