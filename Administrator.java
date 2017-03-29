public class Administrator {
    private String nume = new String();
    private Teatru teatru;
    private boolean logged = false;

    public Administrator(String nume, Teatru teatru, boolean logged) {
      this.nume = nume;
      this.teatru = teatru;
      this.logged = logged;
    }

    public void login() {
        this.logged = true;
      }

    public void logout() {
      this.logged = false;
    }

    public String getNume() {
      return nume;
    }

    public void setNume(String nume) {
      this.nume = nume;
    }

    public Teatru getTeatru() {
      return teatru;
    }

  public void setTeatru(Teatru teatru) {
    this.teatru = teatru;
  }

  public boolean isLogged() {
    return logged;
  }

  public void setLogged(boolean logged) {
    this.logged = logged;
  }

  @Override
  public String toString() {
    return "Administrator{" +
            "nume='" + nume + '\'' +
            ", teatru=" + teatru +
            ", logged=" + logged +
            '}';
  }
}