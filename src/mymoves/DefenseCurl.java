package mymoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

public class DefenseCurl extends StatusMove{
	
	public DefenseCurl() {
		super();	
	}
	
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.DEFENSE, 1);
	}
	
	@Override
	protected String describe() {
		String[] splitedname = this.getClass().toString().split("\\.");
		return "сворачивается, чтобы скрыть слабые места и повысить свой показатель защиты " + splitedname[(splitedname.length - 1)] + "!";
	}
}
