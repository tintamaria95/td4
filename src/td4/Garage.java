package td4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Garage {
	private List<Car> carlist = new ArrayList<Car>();
	private static int id;

	public Garage() {
		id++;
	}

	public int getId() {
		return id;
	}

	public void add_car(Car c) {
		try {
			Car ctest = Objects.requireNonNull(c);
			carlist.add(ctest);
		} catch (NullPointerException e) {
			System.out.println("L'objet Car c ne peut pas être null.");
		}
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Garage" + id);
		for (Car c : carlist) {
			str.append(c.toString());
		}
		return new String(str);
	}

	public long carsValue() {
		long somme = 0;
		for (Car c : carlist) {
			somme = somme + c.getValue();
		}
		return somme;
	}

	public Car firstCarbyBrand(String brand) {
		for (Car c : carlist) {
			if (c.getBrand() == brand) {
				return c;
			}
		}
		System.out.println("Pas de voiture de cette marque dans ce garage.");
		return null;
	}

	public static void main(String[] args) {
		Garage g = new Garage();
		g.add_car(new Car("c1", 1));
		g.add_car(null);
	}
}

// assertEquals("message", anticipé, output)
//asserthrows()
//assertnull