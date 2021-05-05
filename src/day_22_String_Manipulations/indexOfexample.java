package day_22_String_Manipulations;

public class indexOfexample {
    public static void main(String[] args) {
        String technologies ="java,html,css,selenium,testng,maven,cucumber";
        System.out.println(technologies.indexOf(","));//4
        //firs comma
        System.out.println(technologies.lastIndexOf(","));
        //last comma
        //for middle one ,we need loop
        int indexOfJava =technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int idxOfCss =technologies.indexOf("css");
        System.out.println("css is at index " + idxOfCss);
        int idxOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + idxOfCucumber);
        int indexOfSql = technologies.indexOf("sql");
        System.out.println("sql is at index " + indexOfSql);
        //technologies contains" maven"?
        if(technologies.contains("maven")){
            System.out.println("maven is present");}else{
            System.out.println("maven is not present");
        }
        if(technologies.indexOf("maven") >-1){
            System.out.println("maven is present");}
        else{
            System.out.println("maven is not present");}
        }

    }

