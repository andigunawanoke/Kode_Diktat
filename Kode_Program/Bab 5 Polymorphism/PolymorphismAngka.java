public class PolymorphismAngka extends Polymorphism{
    private int angka;

    public PolymorphismAngka(int angka) {
        this.angka = angka;
    }

    public int getAngka() {
        return angka;
    }
    public void setAngka(int angka) {
        this.angka = angka;
    }

    @Override
    public String getData(){
        return String.valueOf(angka);
    }
}
