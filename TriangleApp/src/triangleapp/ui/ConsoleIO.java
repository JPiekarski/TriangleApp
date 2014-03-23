/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangleapp.ui;

import java.util.Scanner;

/**
 *this file is used to prompt users to input some value and forces them to return a value within a specified range
 * @author Jacob
 */
public class ConsoleIO {

    Scanner sc = new Scanner(System.in);

     /**
     * prompts user with inputed prompt then returns an int the user enters
     * will not return anything but a valid int and will keep trying until a vaild float is entered
     * @param prompt what to ask the user
     * @return int and only a int the user enters
     */
    public int promptInt(String prompt) {

        int input = 0;
        boolean tryagain;

        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(sc.nextLine());
                tryagain = false;
            } catch (NumberFormatException e) {
                tryagain = true;
                System.out.println("Please enter an integer");
            }

        } while (tryagain);

        return input;

    }

    /** takes advantage of promptint and adds a range to it
     *
     * @param prompt what to ask the user
     * @param min minimum value inclusive
     * @param max max value inclusive
     * @return
     */
    public int promptInt(String prompt, int min, int max) {
        int a;

        do {
            
            a = promptInt(prompt);

        } while (a < min || a > max);
        return a;
    }

    
     /**
     * prompts user with inputed prompt then returns an int the user enters
     *
     * @param prompt what to ask the user
     * @return string the user enters
     */
    public String promptString(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();

    }

     /**
     * prompts user with inputed prompt then returns an float the user enters
     * will not return anything but a valid float and will keep trying until a vaild float is entered
     * @param prompt what to ask the user
     * @return float and only a float the user enters
     */
    public float promptFloat(String prompt) {

        float input = 0;
        boolean tryagain;

        do {
            System.out.println(prompt);
            try {
                input = Float.parseFloat(sc.nextLine());
                tryagain = false;
            } catch (NumberFormatException e) {
                tryagain = true;
                System.out.println("Please enter a Float");
            }

        } while (tryagain);

        return input;
    }

    
    /** takes advantage of promptfloat and adds a range to it
     *
     * @param prompt what to ask the user
     * @param min minimum value inclusive
     * @param max max value inclusive
     * @return
     */
    public float promptFloat(String prompt, float min, float max) {
        float a;

        do {
            
            a = promptFloat(prompt);

        } while (a < min || a > max);
        return a;
    }

      /**
     * prompts user with inputed prompt then returns an double the user enters
     * will not return anything but a valid double and will keep trying until a vaild float is entered
     * @param prompt what to ask the user
     * @return double and only a double the user enters
     */
    public double promptDouble(String prompt) {
        double input = 0;
        boolean tryagain;

        do {
            System.out.println(prompt);
            try {
                input = Double.parseDouble(sc.nextLine());
                tryagain = false;
            } catch (NumberFormatException e) {
                tryagain = true;
                System.out.println("Please enter a double");
            }

        } while (tryagain);

        return input;

    }

    /** takes advantage of promptdouble and adds a range to it
     *
     * @param prompt what to ask the user
     * @param min minimum value inclusive
     * @param max max value inclusive
     * @return
     */
    public double promptDouble(String prompt, double min, double max) {
        double a;

        do {
            
            a =  promptDouble(prompt);
            

        } while (a < min || a > max);
        return a;
    }

    public void toConsole(String prompt) {
        System.out.println(prompt);
    }

}
