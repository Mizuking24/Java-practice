package lesson10;

public class Hero2 {
	String name = "吉田";
	int hp = 500;
	
	public void attack() {
		System.out.println(this.name + "の攻撃！");
		System.out.println("5ポイントのダメージを与えた！");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
