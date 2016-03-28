package Attacks;

import Monsters.PokemonBase;
import Types.Globals;

import java.util.Scanner;

/**
 * Created by Ramna on 3/27/2016.
 */
public class fireball extends Moves {

    public String dmg;

    public fireball() {
        this.name = "fireball";
    }

    @Override
    public void performMove(PokemonBase P1, PokemonBase P2) {
        System.out.println("choose your move");
        System.out.println();
        this.name = "fireball";
        double damage = P1.strength;
        damage *= Globals.types.advantages.get(P1.type, P2.type);
        P2.hp -= damage;
        dmg = Double.toString(damage);
        System.out.println(P1.name + " uses " + name +" and does " + dmg + " to " + P2);
        System.out.println(P2 + " has " + P2.hp);
    }

    // @Override

    }


