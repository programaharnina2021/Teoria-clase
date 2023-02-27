package withNonStaticMethods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClassPropertiesInterface06Test {

	
	@Test
	void test() {
		ClassProperties06 sut=new ClassProperties06();
		//condiciones iniciales
		int amount=3;
		int amountDos=0;
		int amountTres=101;
		//pruebas
		int anterior=sut.getAcumulado();
		sut.incrementAmount(amount);
		int posterior=sut.getAcumulado();
		assertEquals(anterior+amount, posterior);
		//pruebas II
		anterior=sut.getAcumulado();
		sut.incrementAmount(amountDos);
		posterior=sut.getAcumulado();
		assertEquals(anterior, posterior);
		//pruebas III
		anterior=sut.getAcumulado();
		sut.incrementAmount(amountTres);
		posterior=sut.getAcumulado();
		assertEquals(anterior, posterior);
		
	}

}
