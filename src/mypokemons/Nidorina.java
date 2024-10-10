package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.Type;

public class Nidorina extends Nidoran {
	
	public Nidorina(String name, int level) {
		super(name, level);
		
		super.setType(Type.POISON);
		super.setStats(70, 62, 67, 55, 55, 56);
		
		Swagger swagger = new Swagger(0, 85);
		Rest rest = new Rest();
		Crunch crunch = new Crunch(80, 100);
		super.setMove(swagger, rest, crunch);
	}
}
