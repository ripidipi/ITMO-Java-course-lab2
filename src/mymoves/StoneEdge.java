package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class StoneEdge extends PhysicalMove {
	
	public StoneEdge(double pow, double acc) {
		super(Type.ROCK, pow, acc);	
	}
	
	public static double chance() {
		return Math.random();
	} 
	
	@Override
	protected double calcCriticalHit(Pokemon att, Pokemon def) {
		if (chance() <= 1/8.) {
			return 2;
		}
		return 1;
	}
	
	@Override
	protected String describe() {
		String[] splitedname = this.getClass().toString().split("\\.");
		return "наносит удары по противнику заостренными камнями снизу. Так критические удары наносятся легче " + splitedname[(splitedname.length - 1)] + "!";
	}
}
