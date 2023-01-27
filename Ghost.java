public class Ghost extends Entity {
	public Ghost() {
		name = "Ghostie";	
		health = 1;
		damage = 2;
	}	

	@Override
	public void report() {
		System.out.println("Hello user, my name is " + name + ".");
		System.out.println("Here are my stats:");
		System.out.println("\tHealth: " + health);
		System.out.println("\tDamage: " + damage);
	 	System.out.println("MAHAHAHAHAH");	
	}		
}
