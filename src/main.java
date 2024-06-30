public class main {
    public static void main(String[] args) {
        double[] Data = new double[3];
        Data[0]=2.0;
        Data[1]=3.34;
        Data[2]=7.1;

        String[] Data2 = new String[2];
        Data2[0] = "pizza";
        Data2[1] = "burger";

        if (Data[0]>Data[1]){
            System.out.println(Data[0] + " is greater than "+ Data[1]);
        }
        else {
            System.out.println(Data[1]+ " is greater than "+ Data[0]);
        }
    }
}