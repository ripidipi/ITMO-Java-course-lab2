package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class WildCharge extends PhysicalMove{
	
	public WildCharge(double pow, double acc) {
		super(Type.ELECTRIC, pow, acc);
	}
	
	@Override
	protected void applySelfDamage(Pokemon p, double acc) {
		p.setMod(Stat.HP, (int)Math.round(0.25  * acc));
	}
	
	@Override
	protected String describe() {
		String[] splitedname = this.getClass().toString().split("\\.");
		return "окутывает себя электричеством и врезается в свою цель " + splitedname[(splitedname.length - 1)] + "!";
	}


}
