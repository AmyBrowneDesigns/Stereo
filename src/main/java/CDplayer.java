import java.util.ArrayList;

public class CDplayer extends Component implements IConnect{

    private ArrayList<Cd> CDCollection;

    public CDplayer(String make, String model) {
        super(make, model);
        this.CDCollection = new ArrayList<Cd>();
    }

    public int CDCount(){
        return this.CDCollection.size();
    }
    
    public void addCD(Cd cd){
        this.CDCollection.add(cd);
    }

    public String play(String data){
        return "Am playing " + data;
    }
}
