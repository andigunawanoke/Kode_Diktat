public class PolymorphismKata extends Polymorphism{
    private String kata;

    public PolymorphismKata(String kata) {
        this.kata = kata;
    }

    public String getKata() {
        return kata;
    }
    public void setKata(String kata) {
        this.kata = kata;
    }

    @Override
    public String getData(){
        return kata;
    }
}
