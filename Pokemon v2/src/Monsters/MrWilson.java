package Monsters;

import Attacks.fireball;
import Types.Globals;

import java.util.Scanner;

/**
 * Created by Ramna on 3/27/2016.
 */
public class MrWilson extends PokemonBase {
    public MrWilson() {
        super(130, 30,6, "MrWilson");
        this.type = Globals.types.FIRE;
    }

    public static void techniques(PokemonBase performing, PokemonBase target) {
        Scanner pick = new Scanner(System.in);
        System.out.println("1. fireball");
        System.out.println("2. Slash");
        String ans = pick.next();
        if(ans.equals(1)) {
            System.out.println("boom1");
            new fireball().performMove(performing, target);
        }

    }


    public static void getName(){
        System.out.println("MrWilson");
    }


    public String toString(){
        return name;
    }
}

