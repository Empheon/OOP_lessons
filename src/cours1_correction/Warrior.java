package cours1_correction;

public class Warrior extends Character {

	private Weapon weapon;

	public Warrior(String name, int hitPoints, Weapon weapon) {
		super(name, hitPoints);
		this.weapon = weapon;
	}

	@Override
	public String attack(Character enemy) {
		return super.attack(enemy) + " with a " + weapon;
	}

	@Override
	public String toString() {
		return "the Warrior " + super.toString();
	}
}
