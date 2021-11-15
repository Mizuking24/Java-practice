package game;

public class Main {
	public static void main(String[] args) {
//		勇者を生成し、フィールドに初期値をセット
		Hero h = new Hero();
		h.name = "吉田";
		h.hp = 100;
		
//		お化けキノコAを生成し、初期化
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
//		お化けキノコBを生成し、初期化
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
//		メソッドを呼び出す
		System.out.println("勇者" + h.name + "を生み出しました。");
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}
