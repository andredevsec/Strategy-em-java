package model;

public enum ISSAliquot {
    MACHADO(0.05),
    ALFENAS(0.06);
    
    private final double aliquot;
    
    private ISSAliquot(double aliquot) {
        this.aliquot = aliquot;
    }
    
    public double getAliquot() {
        return aliquot;
    }
}
