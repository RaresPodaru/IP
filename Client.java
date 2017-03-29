import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Client {
    private String usernume;
    private String parola;
    private ArrayList<Cont> contBancar = new ArrayList<>();
    private ArrayList<Bilet> bilete = new ArrayList<>();
    private boolean logged = false;

    public Client(String usernume, String parola, ArrayList<Cont> contBancar) {
        this.usernume = usernume;
        this.parola = parola;
        this.contBancar = contBancar;
    }

    public Client(String nume, ArrayList<Bilet> bilete) {
        this.usernume = nume;
        this.bilete = bilete;
    }

    public void addBilet(Bilet bilet) {
        bilete.add(bilet);
    }
    public boolean checkLogin(String username, String password) {
        if( username.matches("[A-Z]") == false && username.matches("[a-z]") == false)
            return false;
        if(password.length() < 7)
            return false;

        if(password.matches(".*\\d.*") == false)
            return false;

        return true;
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

    public int getFactura() {
        int suma = 0;
        for(int i = 0; i < this.bilete.size(); i++) {
            suma += this.bilete.get(i).getPret();
        }
        return suma;
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