package withNonStaticMethods;

import model.Coordinate;
import model.Rectangulo;

public class MethodWithReturn02 {

	// non static
	public boolean giveMe() {
		return true;
	}

	public Rectangulo creadorRectangulos(Coordinate leftUp, Coordinate rigthDown) {
		// programacion defensiva∫
		// clausulas de guarda
		if (leftUp != null && rigthDown != null)
			return new Rectangulo(leftUp, rigthDown);
		return null;
	}
}
