
public class Hello_world {
    public static void main(String[] args){
        System.out.println("Hello, world!");
        int angka = 10;
        if (angka < 100){
            System.out.println("angka kecil");
        }
        else {
            System.out.println("angka besar");
            angka += 1;
        }
        for (int nomor=0; nomor<10;nomor++){
            System.out.println(nomor);
        }
        while(angka!=5){
            angka++;
            System.out.println("no stop until angka = 5");
        }
    }
}



