
public class lesson03 {
	public static void main(String[] args) {
//		if文
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします。");
			System.out.println("散歩にいきます。");
		} else {
			System.out.println("DVDを見ます。");
		}
		
//		while文
//		この記述では無限ループしてしまうため注意
//		boolean doorclose = true;
//		while(doorclose == true) {
//			System.out.println("ノックする");
//			System.out.println("1分待つ");
//		}
		
//		if-else if-else文
		int hight = 175;
		if (hight >= 170) {
			System.out.println("Lサイズ");
		} else if (hight >= 155) {
			System.out.println("Mサイズ");
		} else if (hight >= 140) {
			System.out.println("Sサイズ");
		}  else {
			System.out.println("サイズはわかりません");
		}
		
//		switch文
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		switch (fortune) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("吉");
			break;
			default:
			System.out.println("凶");
		}
		
//		do-while構文
//		int temp = 10;
//		do {
//			temp--;
//			System.out.println("温度を一度下げました。");
//		} while(temp > 25);
		
//		for文
		for (int i = 0; i < 10; i++) {
			System.out.println("こんにちは");
		}
		
//		for文のループを二重にして九九の表を出力する。
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
	}
}
