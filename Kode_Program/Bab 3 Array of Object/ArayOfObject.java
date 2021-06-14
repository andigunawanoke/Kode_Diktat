public class ArayOfObject {
    public static void main(String[] args) {
        int[] angka = new int[2];
        String[] kata = new String[6];

        angka[0] = 1;
        angka[1] = 2;
        kata[0] = "a";
        kata[1] = "b";
        kata[2] = "c";
        kata[3] = "d";
        kata[4] = "e";
        kata[5] = "f";

        System.out.println(kata[4]);

        for(int i=0;i<6;i++){
            System.out.println(kata[i]);
        }
    }
}

