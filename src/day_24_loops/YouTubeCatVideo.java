package day_24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {

       // video is 1 min 57 sec while we did not reach to last second
        //print"watching youtube video:second 1"
        //print "finished watching cat video,lets start another one "
        int seconds = 0;
        while(seconds<=117){
            System.out.println("watching cat video " + seconds);
            seconds++;
            Thread.sleep(1000);//pause the code execution for a 1000 miliseconds.(1 second).
        }

    }
}
