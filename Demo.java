import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Entity ent;
		Scanner scan = new Scanner(System.in);		
		System.out.print("Pick a character (type 1, 2, or 3)\n");
		System.out.print("\t1. Ghost\n\t2. Phantom\n\t3. Ghoul\n");	
		
		boolean input_invalid = true;	
		int input = -1;
		while (input_invalid) {
			try {
				input = scan.nextInt();
				input_invalid = false;
			}
			catch (Exception InvalidInput) {
				System.out.println("Invalid input...");
				System.out.println("Type 1, 2, or 3, only!");
				scan.nextLine();		
			}			
		}		
		// If you look at this code, I am sorry about the 
		// try/catch blocks, I know they're not technically correct
			
		scan.close();	

		switch (input) {
			case 1:
				ent = new Ghost();	
				break;
			case 2:
				ent = new Phantom();	
				break;
			case 3:
				ent = new Ghoul();	
				break;
			default:
				ent = new Ghost();
				break;
		}

		System.out.println("\n\n");
		ent.report();
		System.out.println("\n\n");
	}
}
