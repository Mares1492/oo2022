package teineosa;

public class Joogivaat {
    double ruumala;
    double liitritesJooki;

    public Joogivaat(double ruumala, double liitritesJooki) {
        this.ruumala = ruumala;
        this.liitritesJooki = liitritesJooki;
    }

    public void t2idaJoogipudel(JoogiPudel joogiPudel) {
        if (liitritesJooki >= joogiPudel.maht) {
            System.out.println("Jooki mahub!");
        } else {
            System.out.println("Jooki ei mahu!");
        }
    }

    public void villiPudelid(JoogiPudel joogiPudel) {
        int loendur = 0;
        while (liitritesJooki >= joogiPudel.maht) {
            //           liitritesJooki = liitritesJooki - joogiPudel.maht;
            liitritesJooki -= joogiPudel.maht;
            loendur++;
        }
        System.out.println("Villisid " + loendur + " jooki");
    }
}