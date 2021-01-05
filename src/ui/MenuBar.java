/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Asrulbastian
 */
public class MenuBar extends JMenuBar{
    
    private final JMenu mnu1;  
    private final JMenuItem i1; 
    private final JMenuBar mnuBar;
    
    public MenuBar(){
 
        
        mnuBar = new JMenuBar();
        mnu1 = new JMenu("Setting");
        i1 = new JMenuItem("Server");
        
        mnu1.add(i1);
        mnuBar.add(mnu1);
        
        //.setJMenuBar(mb); 
        //setJMenuBar(menuBar);
        
        
        
    }
    
}
