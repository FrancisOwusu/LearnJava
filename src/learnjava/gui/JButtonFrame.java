/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class JButtonFrame extends JFrame {
    private final JButton plainJButton; // button with just text
private final JButton fancyJButton; // button with icons
    
// ButtonFrame adds JButtons to JFrame

    public JButtonFrame(JButton plainJButton, JButton fancyJButton) {
        this.plainJButton = plainJButton;
        this.fancyJButton = fancyJButton;
    }
}
