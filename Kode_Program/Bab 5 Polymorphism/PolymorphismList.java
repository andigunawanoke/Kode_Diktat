import java.util.ArrayList;
import java.util.List;

public class PolymorphismList {
    List<Polymorphism> PolymorphismPolymorphism;

    public PolymorphismList(){
        PolymorphismPolymorphism = new ArrayList<>();
    }

    public void addtoList(Polymorphism Pol){
        PolymorphismPolymorphism.add(Pol);
    }

    public void PolymorphismShow(){
        for(Polymorphism Polka : PolymorphismPolymorphism){
            if (Polka instanceof PolymorphismAngka) {
                System.out.println(Polka.getData()+" Merupakan angka");
            }
            else{
                System.out.println(Polka.getData()+" Merupakan kata");
            }
        }
    }
}
