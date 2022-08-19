package model;

public class IPI implements Tax {
    private double ALIQUIT = 0.15;                
    @Override
    public double calculaTax(double value) {
        return ALIQUIT * value; 
    }
    
}
