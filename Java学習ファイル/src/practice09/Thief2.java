package practice09;

public class Thief2 {
	String name;
	int hp;
	int mp;
	
	public Thief2(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Thief2(String name, int hp) {
		this(name, hp, 5);
	}
	public Thief2(String name) {
		this(name, 40);
	}
}
