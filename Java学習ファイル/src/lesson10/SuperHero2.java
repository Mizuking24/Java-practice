package lesson10;

public class SuperHero2 extends Hero2 {
	boolean flying;
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	
	public void run() {
		System.out.println(this.name + "は撤退した！");
	}
	
	public void attack() {
		super.attack();
		if (this.flying) {
			super.attack();
		}
	}
}
