import java.util.ArrayList;

/**
 * Created by Daniel on 22.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        Teatru singleton = Teatru.getInstance();
        singleton.setNume("Teatru NAtional");
        Cont cont1 = new Cont("Ana", "23165", 1256);
        ArrayList<Cont> listaConturi = new ArrayList<>();
        listaConturi.add(cont1);
        Client client = new Client("ana.da", "dasd", listaConturi );

        System.out.println(singleton.toString());
        System.out.println(client.toString());
    }
}
