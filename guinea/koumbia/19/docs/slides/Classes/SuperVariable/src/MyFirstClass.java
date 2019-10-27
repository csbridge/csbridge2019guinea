import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Creative
 * -----
 * Make any console program you like!
 */
public class MyFirstClass extends ConsoleProgram {

	public void run() {
		setFont("Courier-24");
		
		Student wowReally = new Student();
		wowReally.name = "Bryce";
		wowReally.age = 25;
		
		Student omgAnother = new Student();
		omgAnother.name = "Julia";
		omgAnother.age = 27;
		
		println(wowReally.name);
		println(omgAnother.age);
		println(omgAnother);
		
		

	}
}



