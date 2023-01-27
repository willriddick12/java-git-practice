public class Phantom extends Entity {
	public Phantom() {
		name = "Phantom Guy";	
		health = 5;
		damage = 1;
	}	

	@Override
	public void report() {
		System.out.println("Sup dude, my name is " + name + ".");
		System.out.println("Here are my stats:");
		System.out.println("\tHealth: " + health);
		System.out.println("\tDamage: " + damage);
	 	System.out.println("I don't laugh");	
	}		
}
