package withNonStaticMethods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MethodPrivate04Test {

	@Test
	void test() {
		MethodPrivate04 methodPrivate04=new MethodPrivate04();
//		assertTrue(methodPrivate04.tellMe());
		assertTrue(methodPrivate04.hagoCosasPublicas());
	}

}
