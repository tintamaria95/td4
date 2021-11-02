package td4;

public class Car extends Vehicule {

	private long value;
	private int vetuste;

	public Car(String brand, long value) {
		this.brand = brand;
		this.value = value;
		if (value < 0) {
			throw new IllegalArgumentException(value + "Il est interdit d'avoir une valeur value négative.");
		}
	}

	public Car(String brand, long value, int vetuste) {
		this.brand = brand;
		this.setVetuste(vetuste);
		this.value = value - vetuste * 1000;
		if (value < 0) {
			throw new IllegalArgumentException(value + "Il est interdit d'avoir une valeur value négative.");
		}
	}

	public String getBrand() {
		return brand;
	}

	public long getValue() {
		return value;
	}



	public int getVetuste() {
		return vetuste;
	}

	public void setVetuste(int vetuste) {
		long v = value;
		v = v - vetuste * 1000;
		if (v < 0) {
			throw new IllegalArgumentException(value + "Il est interdit d'avoir une valeur value négative.");
		} else {
			this.value = v;
			this.vetuste = vetuste;
		}

	}
}
