import java.util.ArrayList;

public class Stereo {
    
    private String name;
    private int volume;
    private ArrayList<IConnect> components;

    public Stereo(String name, int volume){
        this.name = name;
        this.volume = volume;
        this.components = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getVolume() {
        return this.volume;
    }

    public int setVolume(int volume) {
        return this.volume = volume;
    }

    public int increaseByOne(){
        return this.volume += 1;
    }

    public int decreaseByOne(){
        return this.volume -= 1;
    }
    
    public void connect(IConnect component){
        components.add(component);
    }
}
