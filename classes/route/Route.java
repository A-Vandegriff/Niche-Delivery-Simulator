package classes.route;
import java.util.Random;



public class Route {
    Random random = new Random();
    private int distanceFarmToField;
    private int distanceFieldToFarm;
    private int totRoundTrip;
    private int[] roundTrip = new int[2];
    private int gravelMiles;
    private int pavedMiles;
    private int gravelSpeedLimit = 30;
    private int pavedSpeedLimit = 55;
    private int[] citySpeedLimit = {25,30,35,40,45,50};

    public Route(){
        
    }
    public int[] roundTrip(){
        distanceFarmToField = random.nextInt(3,11);
        distanceFieldToFarm = random.nextInt(3,11);
        roundTrip[0] = distanceFarmToField;
        roundTrip[1] = distanceFieldToFarm;
        return roundTrip;
    }
    public int totRoundTrip(){
        totRoundTrip = roundTrip[0] + roundTrip[1];
        System.out.println("Farm to field: " + roundTrip[0] + " miles\n" + "Field to Farm: " + roundTrip[1] + " miles");
        System.out.println("Total Miles: " + totRoundTrip);

        return totRoundTrip;
    }



}