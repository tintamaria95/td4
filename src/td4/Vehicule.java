package td4;

public class Vehicule {
	protected String brand;
	private long value;

	public long getValue() {
		return value;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setValue(long value) {
		this.value = value;
	}

	public void discount(long value) {
		this.value = value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "brand : " + brand + ", value : " + value;
	}
}
