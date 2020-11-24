import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony", "AB241120");
    }


    @Test
    public void canGetMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("AB241120", radio.getModel());
    }

    @Test
    public void canTuneRadio(){
        assertEquals("radio tuned!", radio.tuneRadio());
    }

    @Test
    public void canPlayRadio(){
        assertEquals("Am playing Radio 1", radio.play("Radio 1"));
    }
}
