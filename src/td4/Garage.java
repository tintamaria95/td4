package td4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Garage {
	private List<Vehicule> vehiculelist = new ArrayList<Vehicule>();
	private static int id;

	public Garage() {
		id++;
	}

	public int getId() {
		return id;
	}

	public void add(Vehicule v) {
		try {
			Vehicule ctest = Objects.requireNonNull(v);
			vehiculelist.add(ctest);
		} catch (NullPointerException e) {
			System.out.println("L'objet Car c ne peut pas être null.");
		}
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Garage" + id);
		for (Vehicule v : vehiculelist) {
			str.append(v.toString());
		}
		return new String(str);
	}

	public long carsValue() {
		long somme = 0;
		for (Vehicule v : vehiculelist) {
			somme = somme + v.getValue();
		}
		return somme;
	}

	public Car firstCarbyBrand(String brand) {
		for (Object o : vehiculelist) {
			if (o instanceof Car) {
				Car c = (Car) o;
				if (c.getBrand() == brand) {
					return c;
				}
			}

		}
		System.out.println("Pas de voiture de cette marque dans ce garage.");
		return null;
	}

	public void protectionism(String brand) {
		for (Vehicule v : vehiculelist) {
			if(v.getBrand() == brand) {
				vehiculelist.remove(v);
			}
		}
	}

	public static void main(String[] args) {
		Garage g = new Garage();
		g.add(new Car("Renault", 1));
		g.add(null);
		g.add(new Bike("Dacia"));
		g.add(new Bike("Renault"));
		g.protectionism("Dacia");
		System.out.println(g.toString());
	}
}

// assertEquals("message", anticipé, output)
//asserthrows()
//assertnull