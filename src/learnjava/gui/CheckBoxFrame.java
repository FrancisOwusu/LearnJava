/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class CheckBoxFrame extends JFrame{
    private final JTextField textField; // displays text in changing fonts
    private final JCheckBox boldJCheckBox; // to select/deselect bold
private final JCheckBox italicJCheckBox; // to select/deselect italic

// CheckBoxFrame constructor adds JCheckBoxes to JFrame

public CheckBoxFrame()
{
 super("JCheckBox Test");
 setLayout(new FlowLayout());

 // set up JTextField and set its font
 textField = new JTextField("Watch the font style change", 20);
 textField.setFont(new Font("Serif", Font.PLAIN, 14));
 add(textField); // add textField to JFrame
 boldJCheckBox = new JCheckBox("Bold");
italicJCheckBox = new JCheckBox("Italic");
 add(boldJCheckBox); // add bold checkbox to JFrame
 add(italicJCheckBox); // add italic checkbox to JFrame
 
 // register listeners for JCheckBoxes
CheckBoxHandler handler = new CheckBoxHandler();
boldJCheckBox.addItemListener(handler);
italicJCheckBox.addItemListener(handler);
}

// private inner class for ItemListener event handling
private class CheckBoxHandler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent event) {
       
        Font font = null; // stores the new Font
        // determine which CheckBoxes are checked and create Font
        if(boldJCheckBox.isSelected() && italicJCheckBox.isSelected()){
            font = new Font("Sherif",Font.BOLD + Font.ITALIC,14) ;
            }else if(boldJCheckBox.isSelected()){
            font = new Font("serif",Font.BOLD,14);
        }else{
                font = new Font("Serif",Font.PLAIN,14);
            }
        
        textField.setFont(font);
        }

       
    }
}