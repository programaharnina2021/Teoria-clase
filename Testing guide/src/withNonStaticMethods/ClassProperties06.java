package withNonStaticMethods;

public class ClassProperties06 implements ClassPropertiesInterface06 {

	private int acumulado;
	
	@Override
	public void incrementAmount(int amount) {
		if(amount>0&&amount<=100)
		this.acumulado+=amount;
	}

	public int getAcumulado() {
		return acumulado;
	}

	public void setAcumulado(int acumulado) {
		this.acumulado = acumulado;
	}

}
