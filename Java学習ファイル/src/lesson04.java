
public class lesson04 {
	public static void main(String[] args) {
		
//		配列作成の手順
		int[] array;
		array = new int[5];
//		短縮した書方
//		int[] scores = new int[5];
		
//		配列の長さを調べる
		int[] array1 = new int[4];
		int num = array1.length;
		System.out.println("要素の数：" + num);
		
//		配列の要素に値を代入
		int[] array2 = new int[5];
		array2[1] = 30;
		System.out.println(array2[1]);
		
//		配列の自動初期化(0が代入される)
		int[] array3 = new int[5];
		System.out.println(array3[1]);
		
//		配列の省略記法
		int[] array4 = new int[] {20, 30, 40, 50};
		int[] array5 = {20, 30, 40, 50};
		
//		配列を用いた点数管理プログラム
		int[] array6 = {20, 30, 40, 50, 80};
		int sum = array6[0] + array6[1] + array6[2] + array6[3] + array6[4];
		int avg = sum / array6.length;
		System.out.println("合計点数は" + sum + "点");
		System.out.println("平均点数は" + avg + "点");
		
//		for文を使って配列を扱う(ループで配列を回す)
		int[] array7 = {20, 30, 40, 50, 80};
		for (int i = 0; i < array7.length; i++) {
			System.out.println(array7[i]);
		}
		
//		for文を用いた点数管理プログラム
		int[] array8 = {20, 30, 40, 50, 80};
		int sum1 = 0;
		for (int i = 0; i < array8.length; i++) {
			sum1 += array8[i];
		}
		int avg1 = sum1 / array8.length;
		System.out.println("合計点数は" + sum1);
		System.out.println("平均点数は" + avg1);
		
//		50点以上の科目の数を調べる
		int[] array9 = {20, 30, 40, 50, 80};
		int count = 0;
		for (int i = 0; i < array9.length; i++) {
			if (array9[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は：" + count);
		
//		DNAの記号をランダムに表示する
		int seq[] = new int[10];
		
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
			char base[] = {'A', 'T', 'G', 'C'};
			System.out.println(base[seq[i]] + " ");
		}
		
//		拡張for文
		int[] array10 = {20, 30, 40, 50, 80};
		for (int value : array10) {
			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
