/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;
import net.miginfocom.swing.MigLayout;



/**
 *
 * @author Asrul
 */
public class LoginFrm extends JDialog {
    
    JLabel lbUser = new JLabel("Username");
    JLabel lbPass = new JLabel("Password");
    JTextField txtUser = new JTextField(20);
    JPasswordField txtPass = new JPasswordField(20);
    JButton btnLogin = new JButton("LOGIN");
    
    
    public String getUsername(){
        return txtUser.getText().trim();
    }
    
    public String getPassword(){
        return new String(txtPass.getPassword());
    }
    
    public LoginFrm(){
        
        
        JPanel loginPanel = new JPanel(); //create login panel
        Border outline = BorderFactory.createLineBorder(Color.gray); //create border line
        loginPanel.setBorder(outline); //set border line to panel        
        
        loginPanel.setLayout(new MigLayout()); //create miglayout        
        
        JDialog dlgLogin = new JDialog(this, "LOGIN", Dialog.ModalityType.APPLICATION_MODAL);
        
        dlgLogin.setSize(300, 180);
       
        //layout dialog to the center
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();        
        final int x = (screenSize.width - dlgLogin.getWidth()) / 2;
        final int y = (screenSize.height - dlgLogin.getHeight()) / 2;
        dlgLogin.setLocation(x, y);        
               
        //add fields to toppanel
        loginPanel.add(lbUser, "wrap");
        loginPanel.add(txtUser, "wrap, pushx, growx");
        loginPanel.add(lbPass, "wrap");
        loginPanel.add(txtPass, "wrap 15, pushx, growx");
        loginPanel.add(btnLogin, "pushx, growx");
        
        btnLogin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String usr = getUsername();
                String psw = getPassword();
                
                JOptionPane.showMessageDialog(null, "Username : " + usr + " " +"Password: " + psw);

                
            }
        });
        
        
        dlgLogin.add(loginPanel);
        dlgLogin.setVisible(true);
        
    }
    
}
