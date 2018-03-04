package interfaces;

import orderedStructures.Arithmetic;
import orderedStructures.Progression;

public interface Combinable {
	Progression add(Arithmetic ArithP);
	Progression substract(Arithmetic ArithP);
}