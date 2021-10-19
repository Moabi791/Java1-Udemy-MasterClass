package com.company;

public class CarMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car porsche = new Car();
        porsche.setModel("cayenne");

        System.out.println("Model is " + porsche.getModel());
    }
}
