/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleapp.logic;

import triangleapp.model.Triangle;

/**
 *
 * @author Jacob
 */
public class TriDeterminer {

    //returns an in corelating to a response
    //0 - not a triangle
    //1 - equilateral
    //2 - isosceles
    //3 - scalene
    public int triDet(Triangle tri) {

        if (tri.getSideOne() == 0 || tri.getSideTwo() == 0 || tri.getSideThree() == 0) {
            return 0;

        } else if ((tri.getSideOne() + tri.getSideTwo()) <= tri.getSideThree() || (tri.getSideThree()+ tri.getSideTwo()) <= tri.getSideOne() || (tri.getSideOne() + tri.getSideThree()) <= tri.getSideTwo()) {
            return 0;
        } else if (tri.getSideOne() == tri.getSideTwo() && tri.getSideTwo() == tri.getSideThree()) {
            return 1;
        } else if (tri.getSideOne() == tri.getSideTwo() || tri.getSideOne() == tri.getSideThree() || tri.getSideTwo() == tri.getSideThree()) {
            return 2;
        } else {
            return 3;
        }

    }
}
