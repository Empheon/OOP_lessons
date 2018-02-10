package cours1_exercice;

public class Character {

	private static int nbCharacters;

	private String name;
	private int hitPoints;

	public Character(String name, int hitPoints) {
		this.name = name;
		this.hitPoints = hitPoints;
		nbCharacters++;
	}

	public String attack(Character enemy) {
		return this + " attacks " + enemy;
	}

	public static int getNbCharacters() {
		return nbCharacters;
	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	@Override
	public String toString() {
		return name + ", who has " + hitPoints + "HP";
	}

}
