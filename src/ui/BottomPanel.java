/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Asrulbastian
 */
public class BottomPanel extends JPanel{
    
    //SET FIELDS
    JTextField txtUsr = new JTextField("Username");
    JTextField txtBrokerServer = new JTextField("Broker Server");
    JTextField txtSAPServer = new JTextField("SAP Server");
    
    public BottomPanel(){
        
        //set miglayout 
        this.setLayout(new MigLayout());
        
        //set fields disable
        txtUsr.setEnabled(false);
        txtBrokerServer.setEnabled(false);
        txtSAPServer.setEnabled(false);
        
        //add fields in to bottom panel
        this.add(txtUsr, "skip, push, grow");
        this.add(txtBrokerServer, "skip, push, grow");
        this.add(txtSAPServer, "skip, push, grow");
        
        Border outline = BorderFactory.createLineBorder(Color.GRAY);
        setBackground(Color.LIGHT_GRAY); // set a background color
        setPreferredSize(new Dimension(0, 35)); // set panel size
    }
    
}
