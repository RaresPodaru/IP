import java.util.ArrayList;
import java.util.Vector;

public class Teatru extends BazaDate{

    private String nume;
    private Teatru() {};

    private static class TeatruHolder {
      private static final Teatru INSTANCE = new Teatru();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public static Teatru getInstance() {
      return TeatruHolder.INSTANCE;
    }

    public String getNume() {
     return nume;
    }

    public void vizualizare() {
        this.toString();
        super.toString();
    }


    @Override
    public String toString() {
        return "Teatru{" +
                "nume='" + nume + '\'' +
                '}';
    }
}