package game;

public class Main {
	public static void main(String[] args) {
//		剣を持たせた勇者hを生成し、フィールドに初期値をセット
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero("吉田");
		h.sword = s;
		
//		勇者h1を生成し、初期化
		Hero h1 = new Hero("佐藤");
		
//		魔法使いwを生成し、初期化
		Wizard w = new Wizard();
		w.name = "鈴木";
		w.hp = 50;
		
//		お化けキノコAを生成し、初期化
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
//		お化けキノコBを生成し、初期化
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
//		多態性の呼び出し
		Character c = new Dancer();
		
//		メソッドを呼び出す
		System.out.println(h.hp + h.name);
		System.out.println("勇者" + h.name + "を生み出しました。");
		System.out.println("現在の武器は" + h.sword.name);
		System.out.println(h.name + "は" + h.sword.name + "で攻撃した！");
		System.out.println("お化けキノコ" + m1.suffix + "に10のダメージ！");
		h.slip();
		w.heal(h);
		w.heal(h1);
		w.heal(h1);
		m1.run();
		m2.run();
		h.run();
	}
}
