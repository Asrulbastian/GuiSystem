/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Asrul
 */
public class TopPanel extends JPanel{
    
    private JButton btnLogin;
    private JButton btnLogOut;
    private JButton btnPartial;
    
    private void setFirst() {
        btnLogin.setEnabled(true);
        btnLogOut.setEnabled(false);
        btnPartial.setEnabled(false);
    }    

    public void showMenuPanel() {

        //Set Fields
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                new LoginFrm();
            }
        }); 
        
        btnLogOut = new JButton("Logout");
        
        btnPartial = new JButton("Partial Confirmation");

        JPanel menuPanel = new JPanel(); //create login panel
        menuPanel.setLayout(new MigLayout()); //create miglayout

        //Icon warnIcon = new ImageIcon("D:\\Latihan\\JAVA\\GuiSystem\\src\\icon\\login.png");
        //btnLogin.setIcon(warnIcon);
        
        //add fields to toppanel
        btnLogin.setPreferredSize(new Dimension(95, 95));
        menuPanel.add(btnLogin, "skip");
        
        btnLogOut.setPreferredSize(new Dimension(95, 95));
        menuPanel.add(btnLogOut, "skip");

        btnPartial.setPreferredSize(new Dimension(95, 95));
        //btnPartial.setHorizontalTextPosition(SwingConstants.CENTER);
        menuPanel.add(btnPartial);

        this.add(menuPanel, BorderLayout.NORTH);
        
        setFirst();

        /**
         * JLabel lbLogin = new JLabel(); JLabel lbPartialConf = new JLabel();
         *
         * JPanel menuPanel = new JPanel(); //create login panel JPanel
         * menuPanel_1 = new JPanel(); menuPanel.setLayout(new MigLayout());
         * //create miglayout
         *
         * //add fields to toppanel menuPanel.add(lbLogin, "skip");
         *
         * Icon warnIcon = new
         * ImageIcon("D:\\Latihan\\JAVA\\GuiSystem\\src\\icon\\login.png");
         * lbLogin.setIcon(warnIcon); lbLogin.setBorder(new
         * BevelBorder(BevelBorder.RAISED)); menuPanel_1.add(lbLogin);
         *
         * this.add(menuPanel_1);
         */
    }
    
    public TopPanel(){
        setLayout(new MigLayout()); //create miglayout
        
        Border outline = BorderFactory.createLineBorder(Color.LIGHT_GRAY); //create border line
        setBorder(outline); //set border line to panel
        
        setPreferredSize(new Dimension(0, 100)); // set panel size

        
        showMenuPanel();
               
        
    }
    
}
