import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle;

    @Before
    public void before() { this.waterBottle = new WaterBottle(100);}

    @Test
    public void isFull(){assertEquals(100, waterBottle.getVolume());}

    @Test
    public void reduceFromBottle(){assertEquals(90, waterBottle.drinkFromBottle());}

    @Test
    public void pourOutBottle(){assertEquals(0, waterBottle.emptyBottle());}

    @Test
    public void fillUpBottle(){assertEquals(100, waterBottle.fillBottle());}


}
