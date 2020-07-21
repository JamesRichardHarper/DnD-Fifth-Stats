package Methods;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import static java.lang.StrictMath.round;

public class StatsMethods {

    public boolean WillItHit(int AC, int Roll){

        /**
         * Compares the AC input with the roll input.
         * If the roll is higher or equal than the AC, 'Hit' is set to true.
         */

        boolean Hit = false;
        if(Roll >= AC){
            Hit = true;
        }
        return Hit;
    }

    public ArrayList<Boolean> HaveTheyHit(ArrayList<Integer> Rolls){
        ArrayList<Boolean> HitList = new ArrayList<Boolean>();
        for(int Roll:Rolls){
            HitList.add( WillItHit(Config.AC, Roll) );
        }
        return HitList;
    }

    public void SortHits(ArrayList<Boolean> HitList){
        double TotalAttempts = HitList.size();
        double TotalHit = 0;
        double TotalMiss = 0;

        for(Boolean Attack:HitList){
            if(Attack){
                TotalHit = TotalHit + 1;
            }
            if(!Attack){
                TotalMiss = TotalMiss + 1;
            }
        }
        BigDecimal Accuracy = BigDecimal.valueOf(TotalHit/TotalAttempts*100);
        Accuracy = Accuracy.setScale(2, RoundingMode.HALF_UP);

        System.out.println( "AC: " + Config.AC + "\n" +
                            "Total Attack Bonus: " + Config.TotalBonus + "\n" +
                            "Total Attempts: " + TotalAttempts + "\n" +
                            "Hits: " + TotalHit + "\n" +
                            "Misses: " + TotalMiss + "\n" +
                            "Accuracy: " + Accuracy + "%");
    }
}
