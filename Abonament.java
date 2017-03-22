public class Abonament implements Achizitie {
    private int cod;
    private int pret;
    private Client client;

    public Abonament(int cod, int pret, Client client) {
        this.cod = cod;
        this.pret = pret;
        this.client = client;
    }

  public int getCod() {
      return cod;
    }

    public void setCod(int cod) {
      this.cod = cod;
    }

    public int getPret() {
      return pret;
    }

    public void setPret(int pret) {
      this.pret = pret;
    }

    public Client getClient() {
      return client;
    }

    public void setClient(Client client) {
      this.client = client;
    }

  @Override
  public void achizitie() {

  }
}