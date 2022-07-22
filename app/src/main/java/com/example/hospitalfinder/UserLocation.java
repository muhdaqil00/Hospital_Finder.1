package com.example.hospitalfinder;

import java.util.Map;

public class UserLocation {
    private double Longitude;
    private double Latitude;

    public UserLocation(double longitude, double latitude){
        Longitude = longitude;
        Latitude = latitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }

}
