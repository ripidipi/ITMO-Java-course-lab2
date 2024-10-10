package laba2;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {

	public static void main(String[] args) {
		start_battle();
	}
	
	private static void start_battle() {
		Battle b = new Battle();
		Mimikyu p1 = new Mimikyu("Yuki", 1);
		Golett p2 = new Golett("Mao", 1);
		Golurk p3 = new Golurk("Bam", 1);
		Nidoran p4 = new Nidoran("Gukki", 1);
		Nidorina p5 = new Nidorina("Pokki", 1);
		Nidoqueen p6 = new Nidoqueen("Yunn", 1);
		
		b.addAlly(p1);
		b.addAlly(p3);
		b.addAlly(p5);
		
		b.addFoe(p2);
		b.addFoe(p4);
		b.addFoe(p6);
		
		b.go();
	}
}
