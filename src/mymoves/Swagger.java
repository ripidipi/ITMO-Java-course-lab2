package mymoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove{
	
	public Swagger(double pow, double acc) {
		super(Type.NORMAL, pow, acc);	
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().stat(Stat.ATTACK, 2);
		e.confuse(p);
	}
	
	@Override
	protected String describe() {
		String[] splitedname = this.getClass().toString().split("\\.");
		return "приводит противника замешательство. Однако он также повышает показатель атаки противника " + splitedname[(splitedname.length - 1)] + "!";
	}
}
