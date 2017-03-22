/**
 * Created by Daniel on 22.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        Teatru singleton = Teatru.getInstance();
        singleton.setNume("Teatru NAtional");
        //Client client = new Client("ana.da", "dasd", new Cont("Ana", "23165", 1256) );
        System.out.println(singleton.toString());
    }
}
