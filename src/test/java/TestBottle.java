import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBottle {

    Bottle bottle;


    @Before
    public void before(){
        bottle = new Bottle();
    }


    @Test
    public void bottleHasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void bottleCanBeDrunk(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void bottleCanEmpty(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void bottleCanFill(){
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}


