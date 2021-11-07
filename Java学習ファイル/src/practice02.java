
public class practice02 {
	public static void main(String[] args) {
		int a;
		int b;
		a = 20;
		b = a + 5;
		System.out.println(a);
		System.out.println(b);

//		インクリメント・デクリメント
		int c = 100;
		int d = 100;
		c++;
		d--;
		System.out.println(c);
		System.out.println(d);

//		変数の自動型変換
		float e = 3;
		double f = e;
		System.out.println(e);
		System.out.println(f);

//		異なる型同士の算術演算子
		double g = 8.5 / 2;
		long h = 5 + 2L;
		System.out.println(g);
		System.out.println(h);

//		改行なし画面出力の命令
		String i = "すがわら";
		System.out.print("私の名前は");
		System.out.print(i);
		System.out.println("です。");

//		大きい方の数値を代入する命令
		int j = 5;
		int k = 3;
		int l = Math.max(j, k);
		System.out.println("比較実験：" + j + "と" + k + "とで大きい方は" + l);

//		String型をint型に変換する命令
		String old = "31";
		int n = Integer.parseInt(old);
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");

//		ランダムな数を生成する命令
		int m = new java.util.Random().nextInt(90);
		System.out.println("あなたは多分" + m + "歳ですよね？");

//		キーボードから入力を受け付ける命令
//		System.out.println("あなたの名前を入力してください。");
//		String o = new java.util.Scanner(System.in).nextLine();
//		System.out.println("あなたの年齢を入力してください。");
//		int p = new java.util.Scanner(System.in).nextInt();
//		System.out.println("ようこそ、" + p + "歳の" + o + "さん");

//		練習問題
		int x = 5;
		int y = 10;
		String ans = "x+yは" + (x + y);
		System.out.println(ans);

		System.out.println("ようこそ、占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(3);
		fortune++;
		System.out.println("占いの結果が出ました。");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です。");
		System.out.println("1：大吉　2：中吉　3:吉　4:凶");

	}
}
