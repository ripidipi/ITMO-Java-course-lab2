package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Golett extends Pokemon {
	
	final double INF =  1.7976931348623157E+300;
	
	public Golett(String name, int level) {
		super(name, level);
		
		super.setType(Type.GROUND, Type.GHOST);
		super.setStats(59, 74, 50, 35, 50, 35);
		
		ShadowPunch shadowpunch = new ShadowPunch(60, INF);
		HammerArm hammerarm = new HammerArm(100, 90);
		RockSlide rockslide = new RockSlide(75, 90);
		super.setMove(shadowpunch, hammerarm, rockslide);
	}

}
