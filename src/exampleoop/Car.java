/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleoop;

/**
 *
 * @author PC
 */
public class Car {
    
    float carNumber;
    char carMark;

    // to get number of car
    public float getCarNumber() {
        return carNumber;
    }

    // to set number of car
    public void setCarNumber(float carNumber) {
        this.carNumber = carNumber;
    }

    
    /// to get mark of car
    public char getCarMark() {
        return carMark;
    }

    // to set maek of car 
    public void setCarMark(char carMark) {
        this.carMark = carMark;
    }

    // constructor 1
    public Car(float carNumber) {
        this.carNumber = carNumber;
       
    }
     // constructor 2
    public Car( char carMark) {
        this.carMark = carMark;
    }
     // constructor 3 
    public Car(float carNumber, char carMark) {
        this.carNumber = carNumber;
        this.carMark = carMark;
    }
    
    //  Main Constructor
     public Car() {
         Car c1 = new Car('B');
           c1.printCarMark();
         
        System.out.println("____________________________________________________________");
         Car c2 = new Car(125635);
           c2.printNumber();
           
        System.out.println("____________________________________________________________");
         Car c3 = new Car(3123,'G');
           c3.printNumber();
           c3.printCarMark();
             
         
        
    }
    
     // to print car mark
    void printCarMark(){
        System.out.println("car mark : " +this.getCarMark());
    }
    
    /// to print car number
     void printNumber(){
        System.out.println("car number : " +this.getCarNumber());
    }
    
    
}
