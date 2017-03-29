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

    public int cautareSpectacol(String nume) {
        for(int i = 0; i < this.myPiesaTeatru.size(); i++) {
            if(this.myPiesaTeatru.get(i).getTitlu().equals(nume) == true)
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Teatru{" +
                "nume='" + nume + '\'' +
                '}';
    }
}