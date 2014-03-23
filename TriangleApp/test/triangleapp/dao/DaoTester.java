package triangleapp.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class DaoTester {

    public DaoTester() {
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
    //test the method that uses a delimiter
    @Test
    public void lineTest() {

        //create parameters
        String fileName = "trisinglinetest";
        String delim = ",";
        Triangle tri = new Triangle();

        //to make sure the file does exist
        try {
            FileDao dao = new FileDao(fileName, delim);

            try {
                tri = dao.delimSeparatedReader();
            } catch (NumberFormatException ex) {
                System.out.println("not a valid file input");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }

        //run the tests
        assertEquals(tri.getSideOne(), 3);
        assertEquals(tri.getSideTwo(), 3);
        assertEquals(tri.getSideThree(), 3);

    }

    //test the lines method
    @Test
    public void linesTest() {

        String fileName = "trilinestest";
        String delim = "";
        Triangle tri = new Triangle();

        //to make sure the file does exist
        try {
            FileDao dao = new FileDao(fileName, delim);

            try {
                tri = dao.newLineSeparatedReader();
            } catch (NumberFormatException ex) {
                System.out.println("not a valid file input");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DaoTester.class.getName()).log(Level.SEVERE, null, ex);
        }

        //run the tests
        assertEquals(tri.getSideOne(), 3);
        assertEquals(tri.getSideTwo(), 3);
        assertEquals(tri.getSideThree(), 3);

    }
}
