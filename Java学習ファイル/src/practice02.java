
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
		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");
	}
}
