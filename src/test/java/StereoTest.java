import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private Stereo stereo;

    @Before
    public void before(){
        stereo = new Stereo("Soundwaves to Heaven", 5);
    }

    @Test
    public void hasName(){
        assertEquals("Soundwaves to Heaven", stereo.getName());
    }

     @Test
    public void hasVolume(){
        assertEquals(5, stereo.getVolume());
    }

     @Test
    public void canChangeVolume(){
        assertEquals(6, stereo.setVolume(6));
    }

    @Test
    public void increaseVolume(){
        stereo.increaseByOne();
        assertEquals(6, stereo.getVolume());
    }

    @Test
    public void decreaseVolume(){
        stereo.decreaseByOne();
        assertEquals(4, stereo.getVolume());
    }
}
