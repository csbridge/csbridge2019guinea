import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Sorciere extends ConsoleProgram {

	private static RandomGenerator rg = new RandomGenerator();

	public void run() {
		while(true) {
			readLine("Posez une question dont la réponse est oui ou non: ");

			int choix = rg.nextInt(5);

			if(choix == 0) {
				println("Sans aucun doute");
			}
			
			if(choix == 1) {
				println("Oui");
			}
			
			if(choix == 2) {
				println("Redemandez plus tard");
			}
			
			if(choix == 3) {
				println("Non");
			}
			
			if(choix == 4) {
				println("Karel le pense.");
			}
			
			println("");
		}
	}
}
