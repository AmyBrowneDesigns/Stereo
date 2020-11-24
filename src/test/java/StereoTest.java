import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private Stereo stereo;
    private Radio radio;
    private CDplayer cdPlayer;

    @Before
    public void before(){
        stereo = new Stereo("Soundwaves to Heaven", 5);
        radio = new Radio("Sony", "AB241120");
        cdPlayer = new CDplayer("Sony", "SD28hd");
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

    @Test
    public void canConnectComponent(){
        stereo.connect(radio);
        stereo.connect(cdPlayer);
        assertEquals(2, stereo.getComponents());
    }
}
