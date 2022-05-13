
import org.junit.Test;

import static org.junit.Assert.*;

public class AutomaatTest {

    @Test
    public void kontrollinToiduLisamistJaRasvuArvutamist(){
        Toiduaine testToode1 = new Toiduaine("Test Toode", 5.0,10.0,20.0);
        Toiduaine testToode2 = new Toiduaine("Test Toode 2", 1.0,12.1,5.0);
        Toiduaine testToode3 = new Toiduaine("Test Toode 3", 100.0,1222.1,4515.0);

        assertEquals(true,testToode1.checkPercentage());
        assertEquals(true,testToode2.checkPercentage());
        assertEquals(false,testToode3.checkPercentage());
    }

    @Test
    public void kontrollinKasSaabLisadaToodet(){
        Toiduaine testToode1 = new Toiduaine("Test Toode", 5.0,10.0,20.0);
        Toidukomponent testKomponent = new Toidukomponent(30,testToode1);
        DeliContainer deliContainer = new DeliContainer();
        assertTrue(deliContainer.addComponent(testKomponent));
    }
    @Test
    public void kontrollinKasSaabKustutadaToodet(){
        Toiduaine testToode1 = new Toiduaine("Test Toode", 5.0,10.0,20.0);
        Toidukomponent testKomponent = new Toidukomponent(30,testToode1);
        DeliContainer deliContainer = new DeliContainer();
        deliContainer.addComponent(testKomponent);
        assertTrue(deliContainer.removeComponent(testToode1.nimetus));

    }

    @Test
    public void kontrollinKasLoebKokkuOigesti(){
        Toiduaine testToode1 = new Toiduaine("Test Toode", 5.0,10.0,20.0);
        Toiduaine testToode2 = new Toiduaine("Test Toode 2", 1.0,12.1,5.0);
        Toidukomponent testKomponent = new Toidukomponent(30,testToode1);
        Toidukomponent testKomponent2 = new Toidukomponent(50,testToode2);
        DeliContainer deliContainer = new DeliContainer();
        assertFalse(deliContainer.checkProducts());
        deliContainer.addComponent(testKomponent);
        deliContainer.addComponent(testKomponent2);
        assertTrue(deliContainer.checkProducts());





    }

}
