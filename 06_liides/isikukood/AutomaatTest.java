package isikukood;

import kujundid.Kolmnurk;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class AutomaatTest {

    @Test
    public void kontrollin_kas_on_naisterahvas_kuiisikukoodi_alguses_on_4(){
        IsikukoodEE ee = new IsikukoodEE("39508213717");
        assertEquals(true, ee.isMale());
    }
    @Test
    public void kontrolli_kas_kujundi_ymbermoot_arvutatakse_korretselt() {
        Kolmnurk kolmnurk = new Kolmnurk(5.0,6.0,7.0);
        assertEquals(17, kolmnurk.arvutaYmbermoot(),0.1);
    }
}
