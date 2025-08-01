import java.lang.Math.*;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if(speed >= 1 && speed <=4){
            double production = speed * 221;
        
            return production;
        }
        else if(speed<=8){
            double production = speed * 221;
            production = production - ((production*10)/100);
            return production;
        }
        else if(speed==9){
            double production = speed * 221;
            production = production - ((production*20)/100);
            return production;
        }
        else{
           double production = speed * 221;
            production = production - ((production*23)/100);
            return production ;
        }
            }

    public int workingItemsPerMinute(int speed) {
        double production = productionRatePerHour(speed);
        production = production/60;
        return (int) production;
    }
}
