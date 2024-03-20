package com.Abs_win_toolkit;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class TemperatureConversion {
    
    // properties
    private int _width, _height;
    
    public TemperatureConversion(int width, int height) {
        if(width <= 0 || height <= 0) {
            System.out.println("Error: \"width\" or \"height\" cannot be equal or less than zero .TRY AGAIN!");
        } else {
            this._width = width;
            this._height = height;
        } 
    }
    
    public void createFrame() {
        
        Frame frame = new Frame();
        
        frame.setSize(_width, _height);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        
        createLabel(frame, "Celcius");
        createTxtField(frame, 20);
        
        createLabel(frame, "Fahrenheit");
        createTxtField(frame, 20);
    }
    
    public void createLabel(Frame frame, String labelName) {
        frame.add(new Label(labelName));
    }
    
    public void createTxtField(Frame frame, int size) {
        TextField  field = new TextField(size);
        frame.add(field); 
        createButton(frame, "Enter", field);
    }
    
    public void createButton(Frame frame, String btnName, TextField field) {
        Button submitbtn = new Button(btnName);
        submitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(Integer.parseInt(field.getText()));
            }
        });
        frame.add(submitbtn);
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // ========== Tep4reatureConversion (AWT) ==========
        System.out.println("\n========== TepreatureConversion (AWT) ==========\n");
        System.out.print("Enter the width of the frame: ");
        int width = scan.nextInt();
        System.out.print("Enter the height of the frame: ");
        int height = scan.nextInt();
        new TemperatureConversion(width, height).createFrame();
    }
}