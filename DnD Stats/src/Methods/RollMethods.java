package Methods;

import java.util.ArrayList;
import java.util.Random;

public class RollMethods {

    int DiceRoll = 0;
    Random rand = new Random();

    public int rollDice(int OneDiceOfX){

        /**
         * Uses the Random Class to invoke a random number between 0 and the inputted number.
         * Plus one is then added to not roll a 0 and achieve a potential max of the roll.
         * Optional choice of extra modifiers.
         */

        DiceRoll = (rand.nextInt(OneDiceOfX) + 1);
        return DiceRoll;
    }

    public ArrayList<Integer> multiRoll(int HowMany, int DiceSize){

        /**
         * Rolls x amount of dice, between 0 and the given amount.
         */

        ArrayList<Integer> DiceRolls = new ArrayList<Integer>();

        for ( int Start = 0; Start < HowMany; Start++) {
            DiceRolls.add(rollDice(DiceSize));
        }

        return DiceRolls;
    }

    public int attackDice(int Roll){

        /**
         * Converts a dice roll into an attack roll.
         */

        int AttackRoll = Roll + Config.Proficiency + Config.AbilityModifier + Config.Other;
        return AttackRoll;
    }

    public ArrayList<Integer> multiAttackRoll(int HowMany, int DiceSize){

        /**
         * Rolls x amount of dice, between 0 and the given amount.
         * Updates the roll to be an attack roll, vs a raw dice roll.
         */

        ArrayList<Integer> DiceRolls = new ArrayList<Integer>();

        for ( int Start = 0; Start < HowMany; Start++) {
            DiceRolls.add( attackDice(rollDice(DiceSize) ) );
        }

        return DiceRolls;
    }

    public void printRolls(ArrayList<Integer> Rolls){

        /**
         * Prints out the array list given.
         */

        for ( Integer Dice : Rolls){
            System.out.println(Dice);
        }
    }

}
