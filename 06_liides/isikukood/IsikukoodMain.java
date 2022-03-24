package isikukood;

public class IsikukoodMain {
    public static void main(String[] args) {
        IsikukoodEE ee = new IsikukoodEE("39402431256");
        System.out.println(ee.isMale());
        System.out.println(ee.getBirthYear());
        System.out.println(ee.getBirthMonth());

        IsikukoodEE ee2 = new IsikukoodEE("60003431256");
        System.out.println(ee2.isMale());
        System.out.println(ee2.getBirthYear());
        System.out.println(ee2.getBirthMonth());
    }
}