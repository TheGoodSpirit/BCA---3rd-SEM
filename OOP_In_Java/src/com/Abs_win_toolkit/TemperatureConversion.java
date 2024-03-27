package com.Abs_win_toolkit;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class TemperatureConversion {
    
    // Convert button
    private final JButton _convertBtn;
    
    // declaring Labels
    private final JLabel _optionLabel;
    private final JLabel _celciusLabel; 
    private final JLabel _fahrenheitLabel;
    private JLabel toFahrenheit = new JLabel("Type 'F' in option to convert to FAHRENHEIT");
    private JLabel toCelcius = new JLabel("Type 'C' in option to convert to Celcius");
    
    // declaring TextFields
    private final JTextField _optionTextField;
    private static final JTextField _celciusTextField  = new JTextField(5);
    private static final JTextField _fahrenheitTextField = new JTextField(5);
    
    // Defining constant values
    private final int _WIDTH = 350;
    private final int _HEIGHT = 150;
    
    // Constructor
    public TemperatureConversion() {
        
        // formatter
        
        
        JFrame container = new JFrame("TemperatureConversion");
        container.setSize(_WIDTH,_HEIGHT);
        container.setLayout(new FlowLayout());

        _celciusLabel = new JLabel("Celcius : ");
        _celciusTextField.setText("37");
        
        _fahrenheitLabel = new JLabel("Fahrenheit: ");
        _fahrenheitTextField.setText("98");
        
        _optionLabel = new JLabel("Option: ");
        _optionTextField = new JTextField(5);
        _optionTextField.setText("C");
        
        _convertBtn = new JButton("Convert");
        
        // added celcius
        container.add(_celciusLabel);
        container.add(_celciusTextField);
        
        // added fahrenheit
        container.add(_fahrenheitLabel);
        container.add(_fahrenheitTextField);
        
        // added option
        container.add(_optionLabel);
        container.add(_optionTextField);
        
        // added convert button 
        container.add(_convertBtn);
        container.add(toCelcius);
        container.add(toFahrenheit);
        
        // choosing option
        _convertBtn.addActionListener((ActionEvent e) -> {
            switch(_optionTextField.getText()) {
                case "C":
                    convertToCelcius(Integer.parseInt(_fahrenheitTextField.getText()));
                    break;
                case "F":
                    convertToFahrenheit(Integer.parseInt(_celciusTextField.getText()));
                    break;
                default:
                    System.out.println("Invalid input");
            }
        });
     
        // set all the components visible in frame
        container.setVisible(true);
          
    }
    
    
    public static void convertToCelcius(int fahrenheit) {
        double celcius = (fahrenheit - 32) * 5.0 / 9.0;
         _celciusTextField.setText(String.valueOf(String.format("%.2f", Double.valueOf(celcius))));
        System.out.println("Converted to Celcius: " + celcius);
    }
    
    public static void convertToFahrenheit (int celcius) {
        double fahrenheit =(celcius * 9.0 / 5.0) + 32;
        _fahrenheitTextField.setText(String.valueOf(String.format("%.2f", Double.valueOf(fahrenheit))));
        System.out.println("Converted to Fahrenheit: " + fahrenheit);
    }
    
    public static void main(String[] args) {
        new TemperatureConversion();
    }
}
//
//class run {
//    
//}
