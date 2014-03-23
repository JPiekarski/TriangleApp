/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangleapp.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import triangleapp.model.Triangle;

/**
 *
 * @author Jacob
 */
public class FileDao {
    
    private String delimiter;
    private String fileName;
    
    
    //When the dao is created, a filename must be assigned to the filename variable
    public FileDao(String fileName, String delimiter){
        
        
        this.fileName = fileName;
        this.delimiter = delimiter;
    }
    
    //Will load in the file if the numbers are separated by new lines
    //returning a filled triangle object
    public Triangle newLineSeparatedReader() throws FileNotFoundException, NumberFormatException{
        //create a new file object
        File file = new File(fileName + ".txt");
        //create a scanner to read the file
        Scanner in = new Scanner(file);
        
        //create a triangle
        Triangle tri = new Triangle();
        //set the sides, remembering to turn what is read in into integers
        tri.setSideOne(Integer.parseInt(in.nextLine()));
        tri.setSideTwo(Integer.parseInt(in.nextLine()));
        tri.setSideThree(Integer.parseInt(in.nextLine()));
        
        //return the triangle object 
        return tri;
    }
    
    //Will load in the file if the numbers are separated by delimiter
    //returning a filled triangle object
    public Triangle delimSeparatedReader() throws FileNotFoundException, NumberFormatException{
        //create a new file object
        File file = new File(fileName + ".txt");
        //create a scanner to read the file
        Scanner in = new Scanner(file);
        
        //read in the line and split it by the delimiter
        String line = in.nextLine();
        String[] sides = line.split(delimiter);
        
        
        //create a triangle
        Triangle tri = new Triangle();
        
        //set the sides, remembering to turn what is read in into integers
        
        tri.setSideOne(Integer.parseInt(sides[0]));
        tri.setSideTwo(Integer.parseInt(sides[1]));
        tri.setSideThree(Integer.parseInt(sides[2]));
        
         
        
        
        //return the triangle object 
        return tri;
    }
    
    
}
