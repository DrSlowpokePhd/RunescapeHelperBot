import java.util.Hashtable;

public class Character {
	String name;
	Hashtable<String, Integer> levels = new Hashtable<String, Integer>();
	
	public Character() {
		name = "James";
		levels.put("Melee", 1);
	}
	
	public void levelUpSkill(String skill) {
		Integer skillLevel = levels.get(skill);
		skillLevel++;
		levels.put(skill, skillLevel);
	}
}
