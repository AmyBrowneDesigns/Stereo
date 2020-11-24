public class Radio extends Component implements IConnect {
    public Radio(String make, String model) {
        super(make, model);
    }

    public String tuneRadio(){
        return "radio tuned!";
    }

    @Override
    public String play(String channel) {
        return "Am playing " + channel;
    }
}