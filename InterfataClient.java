/**
 * Created by Daniel on 22.03.2017.
 */
public class InterfataClient {
    private Client client;

    public InterfataClient(Client client) {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void createBilet(Piesa piesa, int pret, boolean validat) {
        client.addBilet(new Bilet(piesa, pret, validat));

    }
}
