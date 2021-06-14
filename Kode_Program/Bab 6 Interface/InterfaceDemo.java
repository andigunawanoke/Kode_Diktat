import java.util.Scanner;

public class InterfaceDemo {
    public static void main(String[] args){
        Object[] pilihan = {new InterfaceKata("poi"),
                new InterfaceAngka(13),new InterfaceKata("POL")};
        Scanner sc = new Scanner(System.in);
        System.out.println("dari angka 1-3 pilih salah satu!");
        if(pilihan[sc.nextInt()-1] instanceof InterfaceAngka){
            System.out.println("Anda mendapatkan sebuah Angka");
            System.out.println(((InterfaceAngka)
                    pilihan[sc.nextInt()-1]).showData());
        }
        else{
            System.out.println("Zonk");
            System.out.println(((InterfaceKata)
                    pilihan[sc.nextInt()-1]).showData());
            System.out.println(((InterfaceKata)
                    pilihan[sc.nextInt()-1]).showData());
            System.out.println(((InterfaceKata)
                    pilihan[sc.nextInt()-1]).showData());
        }
    }
}
