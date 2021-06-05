package day_50_inheritance;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * sub Class
 * Child class
 * derived class
 */
public class Teacher extends Person {
    int teacherID;

    public void teach(String topic){
        System.out.println("Teacher is teaching " + topic);
    }

}
