package view;
import model.*;

public class Main {
    public static void main(String[] args){
        Tax strategy = new IPI();
        
        FinalPrice fp = new FinalPrice();
        
        //ESTRATEGIA INICIAL IPI
        fp.setStrategy(strategy);
        double finalPrice = fp.calculateFinalPrice(30000, 0.1);
        System.out.printf("Preço final com IPI : %.2f\n", finalPrice);
        
        //Estrategia alterada para ISS
        strategy = new ISS(ISSAliquot.MACHADO);
        fp.setStrategy(strategy);
        finalPrice = fp.calculateFinalPrice(10000, 0.3);
        System.out.printf("Preço final com IPI : %.2f\n", finalPrice);
        
    }
    
}
