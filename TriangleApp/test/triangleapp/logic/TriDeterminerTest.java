/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangleapp.logic;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import triangleapp.model.Triangle;

/**
 *
 * @author Jacob
 */
public class TriDeterminerTest {
    
    public TriDeterminerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void triDeterminerTest() {
    TriDeterminer triD = new TriDeterminer();
    
    Triangle tri = new Triangle();
    
    //test zero side length 
    tri.setSideOne(0);
    tri.setSideTwo(1);
    tri.setSideThree(1);
    assertEquals(0, triD.triDet(tri));
    //test zero side length
    tri.setSideOne(1);
    tri.setSideTwo(0);
    tri.setSideThree(1);
    assertEquals(0, triD.triDet(tri));
    //test zero side length
    tri.setSideOne(1);
    tri.setSideTwo(0);
    tri.setSideThree(1);
    assertEquals(0, triD.triDet(tri));
    //test zero side length for side = length of sum of other 2
    tri.setSideOne(1);
    tri.setSideTwo(2);
    tri.setSideThree(1);
    assertEquals(0, triD.triDet(tri));
    //test zero side length for side = length of sum of other 2
    tri.setSideOne(1);
    tri.setSideTwo(1);
    tri.setSideThree(2);
    assertEquals(0, triD.triDet(tri));
    //test zero side length for side = length of sum of other 2
    tri.setSideOne(2);
    tri.setSideTwo(1);
    tri.setSideThree(1);
    assertEquals(0, triD.triDet(tri));
    //test zero side length for side > than sum of other 2
    tri.setSideOne(1);
    tri.setSideTwo(3);
    tri.setSideThree(1);
    assertEquals(0, triD.triDet(tri));
    //test zero side length for side > than sum of other 2
    tri.setSideOne(3);
    tri.setSideTwo(1);
    tri.setSideThree(1);
    assertEquals(0, triD.triDet(tri));
    //test zero side length for side > than sum of other 2
    tri.setSideOne(1);
    tri.setSideTwo(1);
    tri.setSideThree(3);
    assertEquals(0, triD.triDet(tri));
    
    
    //test equalateral side length
    tri.setSideOne(1);
    tri.setSideTwo(1);
    tri.setSideThree(1);
    int res = triD.triDet(tri);
    assertEquals(1, res);
    
    
     //test isosceles side length
    tri.setSideOne(2);
    tri.setSideTwo(2);
    tri.setSideThree(1);
    assertEquals(2, triD.triDet(tri));
     //test isosceles side length
    tri.setSideOne(1);
    tri.setSideTwo(2);
    tri.setSideThree(2);
    assertEquals(2, triD.triDet(tri));
     //test isosceles side length
    tri.setSideOne(2);
    tri.setSideTwo(1);
    tri.setSideThree(2);
    assertEquals(2, triD.triDet(tri));
    
    
     //test scalene side length
    tri.setSideOne(3);
    tri.setSideTwo(4);
    tri.setSideThree(5);
    assertEquals(3, triD.triDet(tri));
    
    }
}
