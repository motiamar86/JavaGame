/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame;

/**
 * Main Class to develop our first Game
 * First approch only prints a Hello World! 
 * 
 * @author reisma
 * @version 0.1, 25.10.2012
 */
public class JavaGame {

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
        /** Use the System class's out.println Method to Show a text
         * <p>
         * <em>System</em>: provides standard input, standard output, and error output 
         * streams;
         * access to externally defined properties and environment variables;
         * a means of loading files and libraries;
         * and a utility method for quickly copying a portion of an array.
         * <p>
         * <em>out</em>: The "standard" output stream.
         * This stream is already open and ready to accept output data. 
         * Typically this stream corresponds to display output or another output
         * destination specified by the host environment or user.
         * <p>
         * <em>println</em>: Prints an object. 
         * The string produced by the String.valueOf(Object) method is 
         * translated into bytes according to the platform's default character 
         * encoding, and these bytes are written in exactly the manner of the 
         * PrintStream.write(int) method.
         */                
        System.out.println("Hello World!");
               
    }
}
