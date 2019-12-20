import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;


/**
 * Nombres Aleatoires
 * -----
 * Affiche 1000 nombres aleatoires entre 0 et 100
 */
public class NombresAleatoires extends ConsoleProgram {
	
	// Un generateur de nombres aleatoires
	private RandomGenerator rg = new RandomGenerator();

	public void run() {
		// change ce code pour afficher 1000 nombres aleatoires
		// entre 0 et 100
		int nombreAleatoire = rg.nextInt(0, 10);
		println(nombreAleatoire);	
	}
}
