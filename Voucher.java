public class Voucher implements Achizitie {
    private int cod;
    private int valoare;

    public Voucher(int cod, int valoare) {
      this.cod = cod;
      this.valoare = valoare;
    }

    public int getCod() {
      return cod;
    }

    public void setCod(int cod) {
      this.cod = cod;
    }

    public int getValoare() {
      return valoare;
    }

    public void setValoare(int valoare) {
      this.valoare = valoare;
    }

    @Override
      public void achizitie() {

      }
}