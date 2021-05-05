package day_32_Arrays_split;

public class AWSzones {
    public static void main(String[] args) {
        String app="etsy";
        String zones="us-east-1,us-west-2,us-west-1";
        System.out.println("-----starting deployment of etsy app to AWS zones.....");
        String[]zonesToDeploy = zones.split(",");
        for(String eachZone :zonesToDeploy){
            System.out.println("Deploying["+app+"] to "+eachZone +"...");

        }
    }
}
