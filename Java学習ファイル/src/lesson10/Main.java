package lesson10;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.run();
		
		SuperHero sh = new SuperHero();
		sh.run();
		sh.fly();
		sh.attack();
		
		Hero2 h2 = new Hero2();
		h2.run();
		
		SuperHero2 sh2 = new SuperHero2();
		sh2.run();
		sh2.fly();
		sh2.attack();
	}
}
