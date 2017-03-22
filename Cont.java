public class Cont {
    private String numeClient = new String();
    private String numarCont = new String();
    private final int PIN;

    public Cont(String numeClient, String numarCont, int PIN) {
        this.numeClient = numeClient;
        this.numarCont = numarCont;
        this.PIN = PIN;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getNumarCont() {
        return numarCont;
    }

    public void setNumarCont(String numarCont) {
        this.numarCont = numarCont;
    }

    public int getPIN() {
        return PIN;
    }
}