/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ButtonFrame extends JFrame {

    private final JButton plainJButton; // button with just text
    private final JButton fancyJButton; // button with icons

    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainJButton = new JButton("Plain Button"); // button with text
        add(plainJButton);

        Icon bug1 = new ImageIcon(getClass().getResource("hse.png"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.png"));
        fancyJButton = new JButton("Fancy Button", bug1); // set image
        fancyJButton.setRolloverIcon(bug2); // set rollover image
        add(fancyJButton);//add fancyButton
        
        
        // create new ButtonHandler for button event handling
ButtonHandler handler = new ButtonHandler();
fancyJButton.addActionListener(handler);
plainJButton.addActionListener(handler);
    }
    
    
    // inner class for button event handling
    private class ButtonHandler implements ActionListener{
        //handle button event
        @Override
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(ButtonFrame.this,String.format("You pressed: %", event.getActionCommand()));
            
        }
    }// end class ButtonFrame
    
    
    
}
