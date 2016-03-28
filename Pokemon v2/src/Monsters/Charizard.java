package Monsters;

import Attacks.Moves;
import Types.Globals;
import Attacks.fireball;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by Ramna on 3/27/2016.
 */
public class Charizard extends PokemonBase{
    public Charizard() {
        super(130, 40,6, "Charizard");
        this.type = Globals.types.FIRE;
        this.moves.add(new fireball());
        this.moves.add(new fireball());
    }


    public static void getName(){
        System.out.println("Charizard");
    }


    public String toString(){
        return name;
    }
}
