public class ForceTypeConvert {
    public static void main(String[] args) {
        long a = 100L;
        int b = (int)a;

        System.out.println(b);

        int c = 128;
        byte d = (byte)c;
        System.out.println(d);
    }
}
