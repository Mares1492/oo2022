package teineosa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class JoogiPudelTests {

    // punane -> alt enter -> add junit4 to classpath
    @Test
    public void arvutaKoguMassKuiJookiPole() {
        JoogiPudel joogiPudel = new JoogiPudel(
                12.0, "Klaas", 20.0, 0.2);
        double mass = joogiPudel.getMass();
        assertEquals(20.0, mass, 0.1);
    }

    @Test
    public void arvutaKoguMassKuiJookOn() {
        JoogiPudel joogiPudel = new JoogiPudel(
                12.0, "Klaas", 20.0, 0.2);
        Jook coca = new Jook("Coca cola", 0.6,1.4);
        joogiPudel.jook = coca;
        double mass = joogiPudel.getMass();
        assertEquals(21.4, mass, 0.1);
    }

    @Test
    public void arvutaKoguHindKuiJookiPole() {
        JoogiPudel joogiPudel = new JoogiPudel(
                12.0, "Klaas", 20.0, 0.2);
        double hind = joogiPudel.getKoguhind();
        assertEquals(0.2, hind, 0.1);
    }

    @Test
    public void arvutaKoguHindKuiJookOn() {
        JoogiPudel joogiPudel = new JoogiPudel(
                12.0, "Klaas", 20.0, 0.2);
        Jook coca = new Jook("Coca cola", 0.6,1.4);
        joogiPudel.jook = coca;
        double hind = joogiPudel.getKoguhind();
        assertEquals(1.04, hind, 0.1);
    }
}
