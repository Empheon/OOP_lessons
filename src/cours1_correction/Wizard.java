package cours1_correction;

public class Wizard extends Character {

	private Spell spell;

	public Wizard(String name, int hitPoints, Spell spell) {
		super(name, hitPoints);
		this.spell = spell;
	}

	@Override
	public String attack(Character enemy) {
		return super.attack(enemy) + " with the spell " + spell;
	}

	@Override
	public String toString() {
		return "the Wizard " + super.toString();
	}
}
