package Trainer;

import Monsters.Charizard;
import Monsters.MrWilson;
import Monsters.PokemonBase;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by Ramna on 3/27/2016.
 */
public class team {

    public team(PokemonBase P1) {
        Object[] team = new Object[6];
        team[0]= P1;
        System.out.println(team[0]);
    }

    public static PokemonBase team(PokemonBase P1) { //fires first.
        P1 = chooseTeam.chooseTeam(P1); //returns pokemon location after choice
        System.out.println("team firing"); //prints
        System.out.println("team is printing: " +P1); //prints chosen pokemon
        Object[] team = new Object[6];
        team[0]= P1;
        System.out.println("the 0 spot in the array is "+ team[0]);
        return P1;
    }


}
