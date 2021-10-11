/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author balumullamuri
 */
public class CarFleet {

    private ArrayList<Cars> carfleet;

    public CarFleet() {
        this.carfleet = new ArrayList<Cars>();
    }

   

    public ArrayList<Cars> getCarfleet() {
        return carfleet;
    }

    public void setCarfleet(ArrayList<Cars> carfleet) {
        this.carfleet = carfleet;
    }
    
    public Cars addNewCars(){
        Cars newCars = new Cars();
        carfleet.add(newCars);
        return newCars;
    
    }
    public void deleteCars(Cars cf){
        carfleet.remove(cf);
    
    }

    
}

