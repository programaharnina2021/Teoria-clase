package withNonStaticMethods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Coordinate;

class MethodWithReturn02Test {
	// Subject Under Test
	MethodWithReturn02 sut;

	public MethodWithReturn02Test() {
		super();
		sut = new MethodWithReturn02();
	}

	@Test
	void testGiveMe() {
		assertTrue(sut.giveMe());
	}

	@Test
	void testCreadorRectangulos() {
		// condiciones prueba
		Coordinate leftUp = new Coordinate(1, 0);
		Coordinate rightDown = new Coordinate(1, 1);
		// Prueba
		assertNotNull(sut.creadorRectangulos(leftUp, rightDown));
		rightDown = null;
		sut.creadorRectangulos(leftUp, rightDown);
	}

}
