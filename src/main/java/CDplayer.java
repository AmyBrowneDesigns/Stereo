import java.util.ArrayList;

public class CDplayer extends Component {

    private ArrayList<Cd> CDCollection;

    public CDplayer(String make, String model) {
        super(make, model);
        this.CDCollection = new ArrayList<Cd>();
    }
}
