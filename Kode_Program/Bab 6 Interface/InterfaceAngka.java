public class InterfaceAngka implements Interface{
    private int angka;

    public InterfaceAngka(int angka) {
        this.angka = angka;
    }

    public int getAngka() {
        return angka;
    }
    public void setAngka(int angka) {
        this.angka = angka;
    }

    @Override
    public String showData(){
        return String.valueOf(getAngka());
    }
}
