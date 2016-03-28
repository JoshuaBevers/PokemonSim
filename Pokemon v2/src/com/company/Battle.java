package com.company;

import Attacks.Moves;
import Attacks.fireball;
import Monsters.Charizard;
import Monsters.MrWilson;
import Monsters.PokemonBase;
import Trainer.*;

import java.util.Scanner;

/**
 * Created by Ramna on 3/27/2016.
 */
public class Battle {

    public static void battle(PokemonBase P1, PokemonBase P2) {
        P1 = Trainer.chooseTeam.chooseTeam(P1);
        P2 = new MrWilson();
        do {
            System.out.println(P1 + " begins the fight against " + P2);
            Moves m = P1.techniques();
            m.performMove(P1,P2);

            if (P2.hp <= 1) {
                System.out.println(P2 + " has lost the fight");
                return;
            }

            P1.hp -= P2.strength;

            System.out.println(P2 + " does " + P2.strength + " damage to " + P1 + " and " + P1 + " has " + P1.hp + " left.");

            if (P1.hp <= 1) {
                System.out.println(P1 + " has lost the fight");
                return;
            }
        } while (P1.hp >= 1 && P2.hp >= 1);


    }

    public static void techniques(PokemonBase performing, PokemonBase target) {
        Scanner pick = new Scanner(System.in);
        //pick.reset();
        System.out.println("1. fireball");
        System.out.println("2. Slash");
        String ans = pick.next();
        if (ans.equals(1)) {
            System.out.println("boom1");
            new fireball().performMove(performing, target);
        }
    }
}
