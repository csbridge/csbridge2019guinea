import stanford.karel.*;

public class LigneDeBeepers extends SuperKarel {
	
	public void run() {
		while(frontIsClear()) {
			putBeeper();
			move();
		}
		putBeeper();
	}

}
