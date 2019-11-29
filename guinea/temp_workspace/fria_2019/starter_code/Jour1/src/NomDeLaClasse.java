import stanford.karel.*;

/*
 * Les commentaires peuvent etre inclus dans
 * n'importe quelle partie du programme. Elles
 * commencent par un slash-asterisque et
 * finissent par un asterisque-slash.
 */

/*definition d'une nouvelle classe*/
public class NomDeLaClasse extends Karel {

   public void run() {
      // inserer des instructions ici.
   }

   // definir des methodes ici.
}




private class NomDeLaClasse extends Karel {
	
	public void run() {
		frontIsClear();
		leftIsClear();
		rightIsClear();
		
		frontIsBlocked();
		rightIsBlocked();
		leftIsBlocked();
		
		facingEast();
		facingWest();
		facingNorth();
		facingSouth();
		
		notFacingEast();
		notFacingWest();
		notFacingNorth();
		notFacingSouth();
		
		beepersPresent();
		noBeepersPresent();
		
		beepersInBag();
		noBeepersInBag();
	}
	
	
	void commandesDeBase() {
		move();
		pickBeeper();
		putBeeper();
		turnLeft();
		
	}
	
	void controlStructures() {
		
		boolean condition = true;
		int N = 10;
		
		
		if(condition) {
			// instructions à executer 
			// si condition est vrai
		}
		
		
		
		
		if (condition) {
			// instructions à executer 
			// si condition est vrai
		}
		else
		{
			// instructions à executer
			// si condition est faux
		}
		
		
		
		
		while(condition) {
			// instructions à repeter
			// tant que condition est vrai
		}
		
		
		
		for(int i=0; i<N; i++) {
			// instructions à repeter N fois
		}
		
		
		nomDeMethode();
		
		
	}

	
	private void nomDeMethode() {
		// instructions de la methode ici...
	}
	
	
	
}

class Test2 extends SuperKarel{
	public void test() {
		turnRight();
		turnAround();
	}
	
	public void test2() {
		double p=0;
		int couleur=0;
		
		random();
		random(p);
		cornerColorIs(couleur);
	}
}







