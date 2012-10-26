/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame;

import javax.swing.JFrame;

/**
 * Main Class to develop our first Game
 * First approch only prints a Hello World! 
 * 
 * @author reisma
 * @version 0.1, 25.10.2012
 */
public class JavaGame extends JFrame{

    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    /**
     * Constructor of the JavaGame Class
     * It simple gives a Hello World output on the console
     */
    public JavaGame(){
          
        setTitle("Hello World!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }
    /**
     * Main Method which is the start point for you Programm
     * This means a call on the command line like:"C:\> java JavaGame"
     * Will start up Java and your programm Execution will start here!
     * any Arguments written after "JavaGame" can be found in the String array 
     * args
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an Object of the JavaGame class
        new JavaGame();
        
    }
}
