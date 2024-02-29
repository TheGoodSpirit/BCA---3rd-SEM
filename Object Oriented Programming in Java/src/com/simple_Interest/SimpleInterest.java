package com.simple_Interest;

public class SimpleInterest {
    // properties
    int _principal;
    float _rate;
    int _time;
    
    // constructor
    public SimpleInterest(int p, int t, float r) {
        if(p<=0 || t<=0 || r<=0) {
            System.out.println("Ivalid Input.TRY AGAIN!");
        }
        else {
            this._principal = p;
            this._rate = r;
            this._time= t;
            Calculate();
        }
    }
    
    void Calculate() {
        System.out.println("SI = " + (_principal * _time * _rate)/100);
    }
}
