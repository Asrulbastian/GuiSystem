/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;


/**
 *
 * @author Asrul
 */
public class MainFrm extends JFrame{
    
    public MainFrm(){
        
        //create a Top Panel and get class TopPanel
        TopPanel topPanel = new TopPanel(); 
        this.getContentPane().add(topPanel, BorderLayout.NORTH); // add a panel to Frame and set nort layout
        
        //create a Bottom Panel and get class BottomPanel
        BottomPanel bottomPanel = new BottomPanel();
        this.getContentPane().add(bottomPanel, BorderLayout.SOUTH); // add a panel to Frame and set south layout
        

        this.setTitle("GUI System");
        
        //set title frame center
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                titleAlign(); //get the function
            }

        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit
        this.setMinimumSize(new Dimension(500, 200)); //set minimum Jframe size 
        //this.setPreferredSize(new Dimension(100, 100));
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH); // set Jframe to maximum size
        this.pack(); //
        this.setVisible(true);

        //call loginFrm
        LoginFrm login = new LoginFrm();
        this.getContentPane().add(login);
          
    }
    
    
    //create function set title aligment center
    private void titleAlign() {

        Font font = this.getFont();

        String currentTitle = this.getTitle().trim();
        FontMetrics fm = this.getFontMetrics(font);
        int frameWidth = this.getWidth();
        int titleWidth = fm.stringWidth(currentTitle);
        int spaceWidth = fm.stringWidth(" ");
        int centerPos = (frameWidth / 2) - (titleWidth / 2);
        int spaceCount = centerPos / spaceWidth;
        String pad = "";
        pad = String.format("%" + (spaceCount - 14) + "s", pad);
        this.setTitle(pad + currentTitle);

    }
    
}
