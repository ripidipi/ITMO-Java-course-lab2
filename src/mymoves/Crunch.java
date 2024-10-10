package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Crunch extends PhysicalMove {
	
	public Crunch(double pow, double acc) {
		super(Type.DARK, pow, acc);	
	}
	
	public static double chance() {
		return Math.random();
	} 
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		if (chance() <= 0.2) {
			p.setMod(Stat.DEFENSE, -1);
		}
	}
	
	@Override
	protected String describe() {
		String[] splitedname = this.getClass().toString().split("\\.");
		return "кромсает противника острыми клыками. Также это может снизить показатель защиты жертвы " + splitedname[(splitedname.length - 1)] + "!";
	}
}
