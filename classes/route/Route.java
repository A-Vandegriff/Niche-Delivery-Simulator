package classes.route;

public class Route {
    private String startLocation;
    private String endLocation;
    private double distanceMiles;
    private int travelMinutes;

    public Route(){

    }
    public void setStartLocation(String startLocation){
        this.startLocation = startLocation;

    }
    public String getStartLocation(){
        return startLocation;
    }
     public void setEndLocation(String endLocation){
        this.endLocation = endLocation;

    }
    public String getEndLocation(){
        return endLocation;
    }

}