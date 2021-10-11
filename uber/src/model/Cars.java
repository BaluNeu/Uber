/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.Duration;

/**
 *
 * @author balumullamuri
 */
public class Cars {
    //variables declared
    private String manufacturer;
    private int year;
    private String location;
    private int seats;
    private long serialnum;
    private String modelnum;
    private String availability;
    private String Cert;
    private Double distance;
    

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    
   

    public long getSerialnum() {
        return serialnum;
    }

    public void setSerialnum(long serialnum) {
        this.serialnum = serialnum;
    }

    public String getModelnum() {
        return modelnum;
    }

    public void setModelnum(String modelnum) {
        this.modelnum = modelnum;
    }


    public String getCert() {
        return Cert;
    }

    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    

    @Override
    public String toString() {
        return "Cars{" + "manufacturer=" + manufacturer + ", year=" + year + ", location=" + location + ", seats=" + seats + ", serialnum=" + serialnum + ", modelnum=" + modelnum + ", availability=" + availability + ", Cert=" + Cert + ", distance=" + distance + '}';
    }

    
    
   
}
