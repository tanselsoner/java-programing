package day_31_arrays;

public class charArray {
    public static void main(String[] args) {
        char[] letter = {'j', 'a' ,'v' ,'a' ,' ' ,'i' ,'s',' ' ,'f', 'u', 'n'};
        //print each letter using a loop
        for(char each :letter){
            System.out.print(each+ " ");}
        //when we have char array we can create string out of it it wil join each letter to single string
        String sentence=new String(letter);
        System.out.println("\nsentence = " + sentence);
        //convert string to char array
        String item ="wooden spoon";
        char[]itemArray=item.toCharArray();
        System.out.println("itemArray.lenght = " + itemArray.length);
        System.out.println("item.lenght() =" +item.length());
        //string class internally uses charArray
        String[] fruits ={"bananas","apples","kivi","mango","papaya","strawberry"};
        //"bananas-apples-kiwi-mango-papaya-strawberry-"
        String fruitStr= "";
        for(String each: fruits){
            System.out.print(each +"-");
        fruitStr+=each+"-";}
        System.out.println("\nfruitStr = " + fruitStr);

        String[] languages={"java","python","c++","sql","ruby","javascript"};
        System.out.println(String.join("|",languages));
        System.out.println(String.join("##",languages));
        String joinedlanguages= String.join("<>" ,languages);
        System.out.println("joinedlanguages = " + joinedlanguages);
                





    }
}
