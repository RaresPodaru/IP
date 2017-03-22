import java.util.ArrayList;

public class BazaDate {

  protected ArrayList<Actori> actori = new ArrayList<>();
  protected ArrayList<Piesa> myPiesaTeatru = new ArrayList<>();
  protected Administrator administrator;

  public ArrayList<Piesa> getMyPiesaTeatru() {
    return myPiesaTeatru;
  }

  public void addPiesaTeatry(Piesa piesa) {
    myPiesaTeatru.add(piesa);
  }

  public Administrator getAdministrator() {
    return administrator;
  }

  public void setAdministrator(Administrator administrator) {
    this.administrator = administrator;
  }

  public ArrayList<Actori> getActori() {
    return actori;
  }

  public void setActori(ArrayList<Actori> actori) {
    this.actori = actori;
  }

  public void setMyPiesaTeatru(ArrayList<Piesa> myPiesaTeatru) {
    this.myPiesaTeatru = myPiesaTeatru;
  }

  @Override
  public String toString() {
    return "BazaDate{" +
            "actori=" + actori +
            ", myPiesaTeatru=" + myPiesaTeatru +
            ", administrator=" + administrator +
            '}';
  }
}