package com.Abs_win_toolkit;

import java.awt.*;

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
        
        createButton(frame, "Submit");
    }
    
    public void createLabel(Frame frame, String labelName) {
        frame.add(new Label(labelName));
    }
    
    public void createTxtField(Frame frame, int size) {
        frame.add(new TextField(size));
    }
    
    public void createButton(Frame frame, String btnName) {
        frame.add(new Button(btnName));
    }
}