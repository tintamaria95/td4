package td4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GarageTest {
	private Garage g;

	@Before
	public void setUp() {
		g = new Garage();

	}

	@Test
	public void test() {
		g.add(null);
		g.add(new Car("Renault", 10000));
		Car c2 = new Car("Dacia", 3000);
		g.add(c2);
		assertEquals(c2, g.firstCarbyBrand("Dacia"));
	}

}
