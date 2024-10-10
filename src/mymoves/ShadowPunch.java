package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ShadowPunch extends PhysicalMove {
	
	public ShadowPunch(double pow, double acc) {
		super(Type.GHOST, pow, acc);	
	}

	@Override
	protected String describe() {
		String[] splitedname = this.getClass().toString().split("\\.");
		return "наносит удар из тени. От него нельзя уклониться " + splitedname[(splitedname.length - 1)] + "!";
	}
}
