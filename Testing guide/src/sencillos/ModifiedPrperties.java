package sencillos;

public class ModifiedPrperties {
	private int algo;

	public int getAlgo() {
		return algo;
	}

	public void setAlgo(int algo) {
		this.algo = algo;
	}

	public void modifyingPropertie(int modifier) {
		algo += modifier;
	}
}
