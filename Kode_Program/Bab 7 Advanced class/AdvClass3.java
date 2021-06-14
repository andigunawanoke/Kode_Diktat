public class AdvClass3 {
    public static void main(String[] args){
        AdvClassData data = new AdvClassData("poi");
        System.out.println(data.getKata());
    }

    public static class AdvClassData{
        private String kata;

        public AdvClassData(String kata) {
            this.kata = kata;
        }
        public String getKata() {
            return kata;
        }
        public void setKata(String kata) {
            this.kata = kata;
        }
    }
}
