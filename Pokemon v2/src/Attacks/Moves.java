package Attacks;

import Monsters.PokemonBase;

import java.util.Scanner;

/**
 * Created by Ramna on 3/27/2016.
 */
public abstract class Moves {
    public String name;
    public String description;

    public abstract void performMove(PokemonBase performing, PokemonBase target);
    //public abstract void techniques();

}

