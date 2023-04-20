/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.filestreams;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class JFileChooserTest {
    public static void main(String[] args) throws IOException
 {
  JFileChooserDemo application = new JFileChooserDemo();
  application.setSize(400, 400);
  application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  application.setVisible(true);
 }
}
