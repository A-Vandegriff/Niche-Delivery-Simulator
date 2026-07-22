package classes.location;

import java.util.Scanner;

public class Location {
    private double latitude;
    private double longitude;



    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void display() {
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
    }
}

