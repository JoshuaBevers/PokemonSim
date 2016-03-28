package com.company;

import Monsters.Charizard;
import Monsters.MrWilson;
import Monsters.PokemonBase;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        PokemonBase P1 =  new PokemonBase(1,1,1, "null"); // constructors meant to hold places
        PokemonBase P2 = new MrWilson(); // constructors meant to hold places
        System.out.println("Hello");
        Battle.battle(P1,P2);
        //Battle.battle(P1,P2);
        //PokemonBase a = new Charizard();
        //PokemonBase b = new Charizard();
        //Battle.battle(a, b);
    }
}
