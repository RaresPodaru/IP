import java.util.ArrayList;
import java.util.Vector;

public class Piesa {
    private String titlu = new String();
    private ArrayList<Actori> actori = new ArrayList<>();
    private ArrayList<Regizori> regizori = new ArrayList<>();
    private String data;

    public Piesa(String titlu, ArrayList<Bilet> bilete, ArrayList<Actori> actori, ArrayList<Regizori> regizori, String data) {
        this.titlu = titlu;
        this.actori = actori;
        this.regizori = regizori;
        this.data = data;
    }
    public Piesa(String nume) {
        this.titlu = nume;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public ArrayList<Actori> getActori() {
        return actori;
    }

    public void setActori(ArrayList<Actori> actori) {
        this.actori = actori;
    }

    public ArrayList<Regizori> getRegizori() {
        return regizori;
    }

    public void setRegizori(ArrayList<Regizori> regizori) {
        this.regizori = regizori;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}