package game2;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		
		h.name = "ミズキ";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
		
		Matango m1 = new Matango();
		m1.suffix = 'A';
		m1.hp = 50;
		
		Matango m2 = new Matango();
		m2.suffix = 'B';
		m2.hp = 50;
		
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}
