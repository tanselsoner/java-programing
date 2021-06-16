package day_52_inheritance;

public class instagram extends MobileApp{
    public void postPhoto(){
        System.out.println("posting photo on instagram");
    }
    @Override
    public void useTheApp(int minutes){
        System.out.println("Using instagram app features  ");
        postPhoto();
    }

    public void SetName(String instagram) {
    }
}
