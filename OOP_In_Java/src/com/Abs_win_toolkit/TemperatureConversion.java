package com.Abs_win_toolkit;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class TemperatureConversion {
    
    // Convert utton
    private final JButton _convertBtn;
    
    // declaring Labels
    private final JLabel _optionLabel;
    private final JLabel _celciusLabel; 
    private final  JLabel _fahrenheitLabel;
    
    // declaring TextFields
    private final  JTextField _optionTextField;
    private final  JTextField _celciusTextField;
    private final JTextField _fahrenheitTextField;
    
    // Defining constant values
    private final int _WIDTH = 350;
    private final int _HEIGHT = 250;
    private final int _OFFSET = 32;
    private final double _toCelcius = 5/9;
    private final double _toFahrenheit = 9/5;
    
    // Constructor
    public TemperatureConversion() {
        
        JFrame container = new JFrame("TemperatureConversion");
        container.setSize(_WIDTH,_HEIGHT);
        container.setLayout(new FlowLayout());
        
        _celciusLabel = new JLabel("Celcius : ");
        _celciusTextField = new JTextField(5);
        _celciusTextField.setText("32");
        
        _fahrenheitLabel = new JLabel("Fahrenheit: ");
        _fahrenheitTextField = new JTextField(5);
        _fahrenheitTextField.setText("0");
        
        _optionLabel = new JLabel("Option: ");
        _optionTextField = new JTextField(5);
        _optionTextField.setText("1");
        
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
        
        // choosing option
        _convertBtn.addActionListener((ActionEvent e) -> {
            switch(Integer.parseInt(_optionTextField.getText())) {
                case 1:
                    convertToCelcius(Integer.parseInt(_fahrenheitTextField.getText()));
                    break;
                case 2:
                    convertToFahrenheit(Integer.parseInt(_celciusTextField.getText()));
                    break;
                default:
                    System.out.println("Invalid input");
            }
        });
     
        // set all the components visible in frame
        container.setVisible(true);
          
    }
    
    public static void convertToCelcius(int v) {
        System.out.println(v);
    }
    
    public static void convertToFahrenheit (int m) {
        System.out.println(m);
    }
    
}

class run {
    public static void main(String[] args) {
        new TemperatureConversion();
    }
}

