import acm.program.ConsoleProgram;

/**
 * Program: EMC2
 * -------------
 * Ce programme aide les utilisateurs à calculer la quantité d’énergie qu’ils
 * pourraient obtenir s’ils transformaient leur masse. Merci Einstein!
 */
public class EMC2 extends ConsoleProgram {

	// Cela déclare une constante ... dont la valeur ne peux jamais estre modifiee.
	// Vitesse de la lumière en m/s
	private static final double C = 299792458;

	public void run() {
		while(true) {
			// Lire la masse de l'utilisateur.
			double masseEnKg = readDouble("Entrez votre masse en kilogrammes: ");

			// Calculer l'énergie
			double energieEnJoules = masseEnKg * C * C;

			// Affiche le résultat à l'utilisateur
			println("e = m * C^2...");
			println("m = " + masseEnKg + " kg");
			println("C = " + C + " m/s");
			println(energieEnJoules + " joules d'énergie!");
			println("");
		}
	}
}