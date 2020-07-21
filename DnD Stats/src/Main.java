/**
 * DnD Main Stats File
 * v1.0
 * 21.07.2020
 * James Harper
 */

import Methods.RollMethods;
import Methods.StatsMethods;

import java.util.ArrayList;

/**
 * Used to instantiate the DnD Stats finder
 */

public class Main {

    static RollMethods rollMethods = new RollMethods();
    static StatsMethods statsMethods = new StatsMethods();

    public static void main(String[] args){

        ArrayList<Integer> Rolls = rollMethods.multiAttackRoll(10000,20);
        ArrayList<Boolean> StackOHits = statsMethods.HaveTheyHit(Rolls);
        statsMethods.SortHits(StackOHits);
    }

}
