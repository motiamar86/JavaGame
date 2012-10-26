/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame;

import java.awt.Graphics;
import java.awt.Paint;
import javax.swing.JPanel;

/**
 *
 * @author reisma
 */
public class View extends JPanel{
    
    private String message;
    private int posx, posy;
    
    public View(String text, int posx, int posy){
        message = text;
        this.posx = posx;
        this.posy = posy;        
    }
    
    @Override
    public void paint(Graphics g){
        g.drawString(message, posx, posy);
    }
}
