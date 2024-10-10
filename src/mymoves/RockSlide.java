package mymoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class RockSlide extends PhysicalMove {
	
	public RockSlide(double pow, double acc) {
		super(Type.ROCK, pow, acc);	
	}
	
	public static double chance() {
		return Math.random();
	} 
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		def.setMod(Stat.HP, (int) Math.round(damage));	
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect.flinch(p);
	}
	
	@Override
	protected String describe() {
		String[] splitedname = this.getClass().toString().split("\\.");
		return "бросает большие валуны в команду противника, чтобы нанести урон. Это также может испугать " + splitedname[(splitedname.length - 1)] + "!";
	}
}
