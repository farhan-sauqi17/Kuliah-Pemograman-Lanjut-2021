package Classes_and_Objects;

public class Return_Type {
    public static void main(String[] args) {
        int x = 10;
        int y = myFunc(x);
        System.out.println(y);
    }
    public static int myFunc(int x) {
        return x*3;
    }
}
