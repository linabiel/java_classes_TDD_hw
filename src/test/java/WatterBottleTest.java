import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WatterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void canDrink() {
        assertEquals(90, waterBottle.drink());
        assertEquals(80, waterBottle.drink());
    }

    @Test
    public void canEmptyBottle() {
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void canFillBottle() {
        assertEquals(100, waterBottle.fill());
    }
}
