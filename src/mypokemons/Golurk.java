package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.Type;

public class Golurk extends Golett {
	
	final double INF =  1.7976931348623157E+300;
	
	public Golurk(String name, int level) {
		super(name, level);
		
		super.setType(Type.GROUND, Type.GHOST);
		super.setStats(89, 124, 80, 55, 80, 55);
		
		ShadowPunch shadowpunch = new ShadowPunch(60, INF);
		HammerArm hammerarm = new HammerArm(100, 90);
		RockSlide rockslide = new RockSlide(75, 90);
		StoneEdge stoneedge = new StoneEdge(100, 80);
		super.setMove(shadowpunch, hammerarm, rockslide, stoneedge);
	}

}
