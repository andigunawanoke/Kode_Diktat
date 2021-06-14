public class InterfaceKata implements Interface{
    private String kata;

    public InterfaceKata(String kata) {
        this.kata = kata;
    }

    public String getKata() {
        return kata;
    }
    public void setKata(String kata) {
        this.kata = kata;
    }

    @Override
    public String showData(){
        return getKata();
    }
}


    