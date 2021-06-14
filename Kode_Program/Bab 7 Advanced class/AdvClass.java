public final class AdvClass {
    private final int angka;
    static private String kata="a";

    public AdvClass(int angka) {
        this.angka = 10;
    }
    public int setAngka(angka){
        this.angka = angka;
    }
    public static void dataShow(){
        System.out.println(angka);
        System.out.println(kata);
    }
    public final void dataShowVer2(){
        System.out.println(angka);
    }
}
