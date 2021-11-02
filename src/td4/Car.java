package td4;

public class Car {
	private final String brand;
	private final long value;

	public Car(String brand, long value) {
		this.brand = brand;
		this.value = value;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "brand : " + brand + ", value : " + value;
	}
}
