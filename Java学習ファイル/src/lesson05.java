
public class lesson05 {
//	メソッドの呼び出し
//	public static void main(String[] args) {
//		System.out.println("メソッドを呼び出します。");
//		hello();
//		System.out.println("メソッドの呼び出しが終わりました。");
//	}
//	public static void hello() {
//		System.out.println("湊さん、こんにちは");
//	}
//	
////	mainメソッド以外からメソッドを呼び出す
//	public static void methodA() {
//		System.out.println("methodA");
//		methodB();
//	}
//	public static void methodB() {
//		System.out.println("methodB");
//	}
//	public static void main(String[] args) {
//		methodA();
//	}
	
//	引数の例(渡す値が一つの場合)
//	public static void main(String[] args) {
//		System.out.println("メソッドを呼び出します。");
//		hello("湊");
//		hello("朝香");
//		hello("菅原");
//		System.out.println("メソッドの呼び出しが終わりました。");
//	}
//	public static void hello(String name) {
//		System.out.println(name + "さん、こんにちは");
//	}
	
//	引数の例(渡す値が複数の場合)
//	public static void main(String[] args) {
//		add(100, 20);
//		add(200, 50);
//	}
//	public static void add(int x, int y) {
//		int ans = x + y;
//		System.out.println(x + "+" + y + "=" + ans);
//	}
	
//	戻り値の例
//	public static int add(int x, int y) {
//		int ans = x + y;
//		return ans;
//	}
//	public static void main(String[] args) {
//		int ans = add(100, 10);
//		System.out.println("100 + 10 = " + ans);
//	}
	
//	戻り値をそのまま使う
//	public static int add(int x, int y) {
//		int ans = x + y;
//		return ans;
//	}
//	public static void main(String[] args) {
//		System.out.println(add(add(10, 20), add(30, 40)));
//	}
	
//	オーバーロード(引数の型が異なる場合)
//	public static int add(int x, int y) {
//		return x + y;
//	}
//	public static double add(double x, double y) {
//		return x + y;
//	}
//	public static String add(String x, String y) {
//		return x + y;
//	}
//	public static void main(String[] args) {
//		System.out.println(add(10, 20));
//		System.out.println(add(3.5, 2.7));
//		System.out.println(add("Hello", "World"));
//	}
	
//	オーバーロード(引数の数が異なる場合)
//	public static int add(int x, int y) {
//		return x + y;
//	}
//	public static int add(int x, int y, int z) {
//		return x + y + z;
//	}
//	public static void main(String[] args) {
//		System.out.println("10 + 20 = " + add(10, 20));
//		System.out.println("10 + 20 + 30 = " + add(10, 20, 30));
//	}
	
//	同じ配列を参照していることを確認する
//	public static void incArray(int[] array) {
//		for (int i = 0; i < array.length; i++) {
//			array[i]++;
//		}
//	}
//	public static void main(String[] args) {
//		int[] array = {1, 2, 3};
//		incArray(array);
//		for (int i : array) {
//			System.out.println(i);
//		}
//	}
	
//	戻り値が配列の場合
//	public static int[] makeArray(int size) {
//		int[] newArray = new int[size];
//		for (int i = 0; i < newArray.length; i++) {
//			newArray[i] = i;
//		}
//		return newArray;
//	}
//	public static void main(String[] args) {
//		int[] array = makeArray(3);
//		for (int i : array) {
//			System.out.println(i);
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
