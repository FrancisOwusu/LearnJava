/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.gui;

/**
 *
 * @author FrancisOwusu
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CustomerProfilePage extends JFrame {
    // GUI Components
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel phoneLabel;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JButton saveButton;
    private JButton cancelButton;

    public CustomerProfilePage() {
        super("Customer Profile Page");

        // Create GUI Components
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        titleLabel = new JLabel("Customer Profile Page");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        nameLabel = new JLabel("Name:");
        nameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        nameField = new JTextField(20);
        nameField.setMaximumSize(nameField.getPreferredSize());

        emailLabel = new JLabel("Email:");
        emailLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        emailField = new JTextField(20);
        emailField.setMaximumSize(emailField.getPreferredSize());

        phoneLabel = new JLabel("Phone:");
        phoneLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        phoneField = new JTextField(20);
        phoneField.setMaximumSize(phoneField.getPreferredSize());

        saveButton = new JButton("Save");
        saveButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveProfile();
            }
        });

        cancelButton = new JButton("Cancel");
        cancelButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Add Components to Main Panel
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        mainPanel.add(nameLabel);
        mainPanel.add(nameField);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(emailLabel);
        mainPanel.add(emailField);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(phoneLabel);
        mainPanel.add(phoneField);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        mainPanel.add(saveButton);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(cancelButton);

        // Add Main Panel to Frame
        getContentPane().add(mainPanel);

        // Set Window Properties
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void saveProfile() {
        // TODO: Implement saving the customer profile data to a database or file
        dispose();
    }

    public static void main(String[] args) {
        CustomerProfilePage customerProfilePage = new CustomerProfilePage();
    }
}

