package com.Abstract_Window_Toolkit;
//importing Java AWT class  
import java.awt.*;    

public class TemperatureConversion {
    
    // properties
    private static int _width, _height;
    
    public TemperatureConversion(int width, int height) {
        if(width <= 0 || height <= 0) {
            System.out.println("Error: \"width\" or \"height\" cannot be equal or less than zero .TRY AGAIN!");
        } else {
            this._width = width;
            this._height = height;
            createFrame();
        } 
    }
    
    public static void createFrame() {
        Frame frame = new Frame();
        frame.setSize(_width, _height);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.add(new Label("Celcius"));
        frame.add(new TextField(16));
    }

    
    public static void  close() {
        System.exit(0 );
    }
}    
 