import java.util.ArrayList;

public class Actori {

    private String nume;
    private ArrayList<Piesa> piese = new ArrayList<>();

    public Actori(String nume, ArrayList<Piesa> piese) {
        this.nume = nume;
        this.piese = piese;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ArrayList<Piesa> getPiese() {
        return piese;
    }

    public void setPiese(ArrayList<Piesa> piese) {
        this.piese = piese;
    }
}