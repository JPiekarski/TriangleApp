/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleapp;

import java.io.FileNotFoundException;

import triangleapp.dao.FileDao;
import triangleapp.logic.TriDeterminer;
import triangleapp.model.Triangle;
import triangleapp.ui.ConsoleIO;

/**
 *
 * @author Jacob
 */
public class TriangleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConsoleIO io = new ConsoleIO();
        Triangle tri = new Triangle();
        TriDeterminer triD = new TriDeterminer();

        io.toConsole("Welcome to the triangle type determination system");

        //determine if 
        int choice = io.promptInt("Will you be using a file or console to enter side lengths\n"
                + "1 - File, 2 - Console", 1, 2);

        if (choice == 1) {
            //determine the type of file they are using
            int fileType = io.promptInt("How is the file laid out? One line or 3 separate lines?\n"
                    + "Type 1 for: side,side,side\n"
                    + "Type 2 for:\n"
                    + "side\n"
                    + "side\n"
                    + "side", 1, 2);

            if (fileType == 1) {
                String delim = io.promptString("What is the delimiter you plan to use");
                String fileName = io.promptString("What is the file name you plan to use (.txt extention already added)");

                boolean tries = true;
                //keep trying until a file is found, make the user retype the filename 
                do {
                    try {
                        FileDao dao = new FileDao(fileName, delim);
                        //makes sure the values read in are integers
                        try {
                            tri = dao.delimSeparatedReader();
                        } catch (NumberFormatException ex) {
                            io.toConsole("not a valid file input, or delimiter");
                        }

                        tries = false;

                    } catch (FileNotFoundException ex) {

                        fileName = io.promptString("Please type in a valid filename");
                    }
                } while (tries);

            } else {
                String delim = "";
                String fileName = io.promptString("What is the file name you plan to use (.txt extention already added)");

                boolean tries = true;
                //keep trying until a file is found, make the user retype the filename 
                do {
                    try {
                        FileDao dao = new FileDao(fileName, delim);

                        //makes sure the values read in are integers
                        try {
                            tri = dao.delimSeparatedReader();
                        } catch (NumberFormatException ex) {
                            io.toConsole("not a valid file input");
                        }

                        tries = false;

                    } catch (FileNotFoundException ex) {

                        fileName = io.promptString("Please type in a valid filename");
                    }
                } while (tries);

            }
            //if they plan on entering it via the console the following code executes
        } else {
            tri.setSideOne(io.promptInt("Please enter a side length (must be greater than 0)", 1, 2147483647));
            tri.setSideTwo(io.promptInt("Please enter a side length (must be greater than 0)", 1, 2147483647));
            tri.setSideThree(io.promptInt("Please enter a side length (must be greater than 0)", 1, 2147483647));
        }
        
        //logic to display what kind of triangle it is
        switch (triD.triDet(tri)){
            
            case 0:
                io.toConsole("\nThe shape is not a triangle\n"
                        + "\u2732\u2732\u2732");
                break;
            case 1:
                io.toConsole("\nThe shape is an eqilateral triangle\n"
                        + "  \u2732\n"
                        + " \u2732 \u2732\n"
                        + "\u2732 \u2732 \u2732");
                break;
            case 2:
                io.toConsole("\nThe shape is an isosceles triangle\n"
                        + "    \u2732\n"
                        + "  \u2732 \u2732\n"
                        + "\u2732 \u2732 \u2732");
                break;
            case 3:
                io.toConsole("\nThe shape is a scalene triangle\n"
                        + "  \u2732\n"
                        + " \u2732\u2732\n"
                        + "\u2732\u2732\u2732");
                break;
            
            
            
        }

    }

}
