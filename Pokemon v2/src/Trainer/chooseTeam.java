package Trainer;

import Monsters.Charizard;
import Monsters.MrWilson;
import Monsters.PokemonBase;

import java.util.Scanner;

/**
 * Created by Ramna on 3/27/2016.
 */
public class chooseTeam {

    public static PokemonBase chooseTeam(PokemonBase P1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your Poke.");
        Charizard.getName();
        MrWilson.getName();
        int Re = scan.nextInt();
        switch(Re){
            case 1: P1= new Charizard();break;
            case 2: P1 = new MrWilson();break;
        }
        scan.reset();
        System.out.println("Pokemon ChooseTeam returns:" + P1.toString());
        return P1; //returns pokemon selected.

    }
}
