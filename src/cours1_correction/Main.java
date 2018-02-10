package cours1_correction;

public class Main {

	public static void main(String[] args) {
		Character c1 = new Character("Jean", 100);
		Character c2 = new Warrior("Thor", 150, Weapon.HAMMER);
		Character c3 = new Wizard("Saruman", 70, Spell.TORNADO);
		Warrior w = new Warrior("Gimli", 120, Weapon.AXE);

		System.out.println(c2.attack(c3));
		System.out.println(w.attack(c1));
		System.out.println(c3.attack(w));
		System.out.println(c1.attack(c1));
		System.out.println("Number of characters " + Character.getNbCharacters());
	}
}
