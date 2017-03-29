public class Bilet {
    private Piesa piesa;
    private int pret;
    private boolean validat = false;

    public Bilet(Piesa piesa, int pret, boolean validat) {
      this.piesa = piesa;
      this.pret = pret;
      this.validat = validat;
    }


    public Piesa getPiesa() {
        return piesa;
    }

    public void setPiesa(Piesa piesa) {
        this.piesa = piesa;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public boolean isValidat() {
        return validat;
    }

    public void setValidat(boolean validat) {
        this.validat = validat;
    }
}