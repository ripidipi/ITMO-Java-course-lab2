package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Present extends PhysicalMove {

		public Present(double pow, double acc) {
			super(Type.NORMAL, pow, acc);	
		}
		
		public static double chance() {
			return Math.random();
		} 
		
		@Override
		protected void applyOppDamage(Pokemon def, double damage) {
			double risk = chance();
			if (risk < 0.2) {
				def.setMod(Stat.HP, -(int)Math.round(def.getStat(Stat.HP) / 4));
				return;
			} if ((risk >= 0.2) & (risk < 0.6)) {
				def.setMod(Stat.HP, (int)Math.round(damage * 0.45));
				return;
			} if ((risk >= 0.6) & (risk < 0.9)) {
				def.setMod(Stat.HP, (int)Math.round(damage * 0.9));
				return;
			}
			def.setMod(Stat.HP, (int)Math.round(damage * 1.4));
		}
		
		@Override
		protected String describe() {
			String[] splitedname = this.getClass().toString().split("\\.");
			return "атакует, давая противнику подарок-ловушку. Однако иногда он восстанавливает здоровье " + splitedname[(splitedname.length - 1)] + "!";
	}
}
