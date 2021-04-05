package Classes_and_Objects;

public class Value_Types {
    public static void main(String[] args) {
        int x = 4;
        square(x);
        System.out.println(x);
    }

    static void square(int x) {
        x = x * x;
    }
}
