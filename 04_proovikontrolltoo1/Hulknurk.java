public class Hulknurk {
    public static void main(String[] args) {
        Klass klass = new Klass();
        klass.setxCoords(3,4,5);
        klass.setyCoords(5,6,7);

        Klass klass2 = new Klass();
        klass2.setxCoords(3,6,87);
        klass2.setyCoords(6,4,7);

        System.out.println(klass);
        System.out.println(klass2);
    }
}