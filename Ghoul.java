public class Ghoul extends Entity {
	public Ghoul() {
		name = "Ghoul Bro";	
		health = 3;
		damage = 3;
	}	

	@Override
	public void report() {
		System.out.println("Horray user, you picked me, " + name + ".");
		System.out.println("Here are my stats:");
		System.out.println("\tHealth: " + health);
		System.out.println("\tDamage: " + damage);
	 	System.out.println("I am the best entity!");	
	}		
}
