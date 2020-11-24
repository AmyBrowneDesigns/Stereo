import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDplayerTest {

    private CDplayer cdPlayer;
    private Cd cd;

    @Before
    public void before(){
        cdPlayer = new CDplayer("Sony", "SD28hd");
        cd = new Cd("Back to Black");
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("SD28hd", cdPlayer.getModel());
    }

    @Test
    public void hasNoCds(){
        assertEquals(0, cdPlayer.CDCount());
    }

    @Test
    public void canAddCDs(){
        cdPlayer.addCD(cd);
        assertEquals(1, cdPlayer.CDCount());
    }

    @Test
    public void canPlay(){
        assertEquals("Am playing music", cdPlayer.play("Back to Black"));
    }

}
