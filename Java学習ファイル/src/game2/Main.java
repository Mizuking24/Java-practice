package game2;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		
		Hero h2 = new Hero();
		
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		System.out.println(h1.hp);
		System.out.println(h1.name);
		System.out.println(h2.name);
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
	}
}
