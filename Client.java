import java.util.ArrayList;

public class Client {
    private String usernume;
    private String parola;
    private ArrayList<Cont> contBancar = new ArrayList<>();
    private boolean logged = false;

    public Client(String usernume, String parola, ArrayList<Cont> contBancar) {
        this.usernume = usernume;
        this.parola = parola;
        this.contBancar = contBancar;
    }


    public void login() {
        this.logged = true;
    }

    public void logout() {
        this.logged = false;
    }



    public String getUsernume() {
      return usernume;
    }

    public void setUsernume(String usernume) {
      this.usernume = usernume;
    }

    public String getParola() {
      return parola;
    }

    public void setParola(String parola) {
      this.parola = parola;
    }

    public ArrayList<Cont> getContBancar() {
      return contBancar;
    }

    public void setContBancar(ArrayList<Cont> contBancar) {
      this.contBancar = contBancar;
    }

  @Override
  public String toString() {
    return "Client{" +
            "usernume='" + usernume + '\'' +
            ", parola='" + parola + '\'' +
            ", contBancar=" + contBancar +
            ", logged=" + logged +
            '}';
  }
}