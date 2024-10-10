package mymoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

public class Rest extends StatusMove {
	
	public Rest() {
		super();	
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		Effect e1 = new Effect().turns(2);
		e1.sleep(p);
		Effect e2 = new Effect().turns(2).stat(Stat.HP, -(int)(p.getStat(Stat.HP)/2));
		p.addEffect(e2);;
	}
	
	@Override
	protected String describe() {
		String[] splitedname = this.getClass().toString().split("\\.");
		return "спит два хода, чтобы востанавливать с каждым ходом сна половину здоровья " + splitedname[(splitedname.length - 1)] + "!";
	}
}
