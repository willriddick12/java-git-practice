import java.util.Scanner;
import java.util.InputMismatchException;

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
				if (input < 1 || input > 3) {
					input_invalid = true;	
					System.out.println("Invalid input...\nType 1, 2, or 3, only!");
				} else input_invalid = false;
			}
			catch (InputMismatchException e){
				System.out.println("Invalid input...\nType 1, 2, or 3, only!");
				scan.nextLine();		
			}
		}		
			
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
