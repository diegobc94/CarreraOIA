package carrera;

public class Cuadra {
	
	private int sociosA;
	private int sociosB;
	private int neutrales;
	private int habitantes;
	
	public Cuadra(int sociosA, int sociosB, int habitantes) {
		this.sociosA = sociosA;
		this.sociosB = sociosB;
		this.neutrales = habitantes-sociosA-sociosB;
		this.habitantes = habitantes;
	}

	public int getSociosA() {
		return sociosA;
	}

	public void setSociosA(int sociosA) {
		this.sociosA = sociosA;
	}

	public int getSociosB() {
		return sociosB;
	}

	public void setSociosB(int sociosB) {
		this.sociosB = sociosB;
	}

	public int getNeutrales() {
		return neutrales;
	}

	public void setNeutrales(int neutrales) {
		this.neutrales = neutrales;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	
	
	
}
