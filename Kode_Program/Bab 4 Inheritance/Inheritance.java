public class Inheritance {
    private int angka;
    protected String kata;

    public Inheritance(int angka, String kata){
        this.angka = angka;
        this.kata = kata;
    }

    public int getAngka() {
        return angka;
    }

    public void setAngka(int angka) {
        this.angka = angka;
    }

    public String getKata() {
        return kata;
    }

    public void setKata(String kata) {
        this.kata = kata;
    }
}
