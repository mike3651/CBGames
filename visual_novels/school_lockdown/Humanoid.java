public abstract class Humanoid {
	/* Common fields shared by subclasses */
	public String name, gender;
	public int hp, att, def;

	/* Gets the health of the character
	 * 
	 * @return the HP stat */
	public int getHp() {
		return hp;
	}

	/* Gets the attack stat
	 * 
	 * @return The attack stat */
	public int getAtt() {
		return att;
	}

	/* Gets the defensive state
	 * 
	 * @return The defense stat */
	public int getDef() {
		return def;
	}

	/* Gets the name of the character
	 * 
	 * @return The name of the character */
	public String getName() {
		return name;
	}

	/* Gets the gender of the character
	 * 
	 * @return The gender of the character */
	public String getGender() {
		return gender;
	}

	/* Methods that vary from class to class */
	abstract int combat(Humanoid other);
	abstract String saying();
}