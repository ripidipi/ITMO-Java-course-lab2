package mymoves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DisarmingVoice extends SpecialMove {
	
	public DisarmingVoice(double pow, double acc) {
		super(Type.FAIRY, pow, acc);
	}
	
	@Override
	protected String describe() {
		String[] splitedname = this.getClass().toString().split("\\.");
		return "выпустив чарующий крик, пользователь наносит эмоциональный урон " + splitedname[(splitedname.length - 1)] + "!";
	}
	
}
