package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoran extends Pokemon {
	
	public Nidoran(String name, int level) {
		super(name, level);
		
		super.setType(Type.POISON);
		super.setStats(55, 47, 52, 40, 40, 41);
		
		Swagger swagger = new Swagger(0, 85);
		Rest rest = new Rest();
		super.setMove(swagger, rest);
	}
}
