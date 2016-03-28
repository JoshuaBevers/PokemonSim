package Monsters;

import Attacks.Moves;
import Attacks.fireball;
import Types.Globals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ramna on 3/27/2016.
 */
public class PokemonBase {

    public ArrayList<Moves> moves = new ArrayList<>();

    public double hp;
    public double strength;
    public double speed;
    public double def;
    public String name;
    public double SpDef;
    public double SpAtt;
    public Globals.types type;
    public String dmg = "";
    static PokemonBase P1 = new PokemonBase(1,1,1, "null");
    static PokemonBase P2 = new PokemonBase(1,1,1, "null");

    public PokemonBase(double h, double s, double sp, String n) {
        hp = h;
        speed = sp;
        strength = s;
        name = n;

    }

    public Moves techniques() {
        Scanner pick = new Scanner(System.in);
        pick.reset();
        //System.out.println("1. fireball");
        //System.out.println("2. Slash");
        for(int i =0; i< this.moves.size();i++){
            System.out.println((i+1) + this.moves.get(i).name);
        }

        String ans = pick.next();
        System.out.println(ans);
        return this.moves.get(Integer.parseInt(ans)-1);

    }


}
