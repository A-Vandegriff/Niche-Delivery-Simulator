package classes.location;

import java.util.Scanner;

public class Location {
    private double latitude;
    private double longitude;
    private String locationName;
    Scanner scnr = new Scanner(System.in);



    public Location(String locationName, double latitude, double longitude) {
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public String getLocationName() {return locationName;}

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void display() {
        System.out.println("Farm name: " + locationName);
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
    }
}

