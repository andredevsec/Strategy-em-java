package model;

public class FinalPrice {
    //Estratégia de calculo
    private Tax tax;
    
    public void setStrategy(Tax tax){
        this.tax = tax;
    }
    public double calculateFinalPrice(double value, double profit){
        double finalProfit = value * profit;
        return value + tax.calculaTax(value) + profit;
    }   
    
}
