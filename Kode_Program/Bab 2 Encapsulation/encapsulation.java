public class Encapsulation {
    private int nomor;
    private String tulisan;

    public Encapsulation(){}

    public Encapsulation(int nomor, String tulisan){
        this.nomor = nomor;
        this.tulisan = tulisan;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public int getNomor() {
        return nomor;
    }

    public void setTulisan(String tulisan) {
        this.tulisan = tulisan;
    }

    public String getTulisan() {
        return tulisan;
    }
}

