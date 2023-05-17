/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Labkom M21
 */
public class mobil {
    private String brand;
    private String model;
    private int year;
    
    public mobil(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void start_engine() {
        System.out.println("Car engine started");
    }
    
    public void stop_engine() {
        System.out.println("Car engine stopped");
    }
    
    public static void main(String[] args) {
        mobil myCar = new mobil("Toyota", "Corolla", 2023);
        
        myCar.start_engine();
        
        myCar.stop_engine();
    }
    
}
