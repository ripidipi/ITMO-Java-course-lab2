package mypokemons;

import mymoves.*;
import ru.ifmo.se.pokemon.Type;

public class Nidoqueen extends Nidorina {
	
	public Nidoqueen(String name, int level) {
		super(name, level);
		
		super.setType(Type.POISON, Type.GROUND);
		super.setStats(90, 92, 87, 75, 85, 76);
		
		Swagger swagger = new Swagger(0, 85);
		Rest rest = new Rest();
		Crunch crunch = new Crunch(80, 100);
		StoneEdge stoneedge = new StoneEdge(100, 80);
		super.setMove(swagger, rest, crunch, stoneedge);
	}
}