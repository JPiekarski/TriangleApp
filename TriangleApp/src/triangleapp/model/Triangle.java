/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//used to hold the integer values of the sides of the triangle for use in the triangle calculation program
package triangleapp.model;

/**
 *
 * @author Jacob
 */
public class Triangle {
    
    //hide the data as part of encapsulation
    private int sideOne;
    private int sideTwo;
    private int sideThree;

    //use methods to get at data as part of encapsulation
    public int getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public int getSideThree() {
        return sideThree;
    }

    public void setSideThree(int sideThree) {
        this.sideThree = sideThree;
    }
    
    
}
