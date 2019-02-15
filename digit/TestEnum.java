package digit;

public class TestEnum {

    public static void main(String[] args) {
        Size size = Size.SMALL;
        System.out.println(size.ordinal());
        System.out.println(size.name());
        System.out.println(Size.MEDIUM);
    }

}
