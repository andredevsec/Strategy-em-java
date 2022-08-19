package model;

public class ICMS implements Tax{
    private ICMSAliquot aliquot;
    
    
    public ICMS(ICMSAliquot aliquot){
        this.aliquot = aliquot;
        
    }
    
    @Override
    public double calculaTax(double value) {
        return aliquot.getAliquot() * value;
    }
}
