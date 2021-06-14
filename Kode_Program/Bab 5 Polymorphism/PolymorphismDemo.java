public class PolymorphismDemo {
    public static void main(String[] args){
        PolymorphismList Pol = new PolymorphismList();
        Pol.addtoList(new PolymorphismAngka(23));
        Pol.addtoList(new PolymorphismKata("poi"));
        Pol.addtoList(new PolymorphismAngka(77));
        Pol.addtoList(new PolymorphismKata("almondo"));
        Pol.PolymorphismShow();
    }
}
