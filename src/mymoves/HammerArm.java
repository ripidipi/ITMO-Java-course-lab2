package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class HammerArm extends PhysicalMove {
	
	public HammerArm(double pow, double acc) {
		super(Type.FIGHTING, pow, acc);	
	}
	
	@Override
	protected void applySelfDamage(Pokemon att, double damage) {
		att.setMod(Stat.SPEED, -1);
	}
	
	@Override
	protected String describe() {
		String[] splitedname = this.getClass().toString().split("\\.");
		return "замахивается и бьет своим сильным и тяжелым кулаком. Однако это снижает его скорость " + splitedname[(splitedname.length - 1)] + "!";
	}
}
