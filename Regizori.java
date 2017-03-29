import java.util.ArrayList;
import java.util.Vector;

public class Regizori {
    private String name = new String();
    private ArrayList<Piesa> piese = new ArrayList<>();

    public Regizori(String name, ArrayList<Piesa> piese) {
        this.name = name;
        this.piese = piese;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Piesa> getPiese() {
        return piese;
    }

    public void setPiese(ArrayList<Piesa> piese) {
        this.piese = piese;
    }

    @Override
    public String toString() {
        return "Regizori{" +
                "name='" + name + '\'' +
                ", piese=" + piese +
                '}';
    }
}