package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mimikyu extends Pokemon {
	
	final double INF =  1.7976931348623157E+300;
	
	public Mimikyu(String name, int level) {
		super(name, level);
		
		super.setType(Type.FAIRY, Type.GHOST);
		super.setStats(55, 90, 80, 50, 105, 96);
		
		WildCharge wildcharge = new WildCharge(90, 100);
		DisarmingVoice disarmingvoice = new DisarmingVoice(40, 	INF);
		Present present = new Present(50, 90);
		DefenseCurl defensecurl = new DefenseCurl();
		super.setMove(wildcharge, disarmingvoice, present, defensecurl);
	}
	
	
}
