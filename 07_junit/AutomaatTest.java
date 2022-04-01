import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AutomaatTest {
    @Test
    public void kontrollin_kas_sugu_on_vahetatud(){
        Girl sue = new Girl("Sue");
        assertNotEquals(Gender.FEMALE,sue.changeGender(1));

        Boy leo = new Boy("Leo");
        assertNotEquals(Gender.MALE,leo.changeGender(1));
    }

    @Test
    public void kontrollin_kas_kasutaja_valik_töötab_korrektselt() {
        Boy mike = new Boy("Mike");
        assertEquals(Gender.BTS, mike.genderPicker(6));
        assertEquals(Gender.BSBC, mike.genderPicker(5));
        assertEquals(Gender.AGS, mike.genderPicker(4));
        assertEquals(Gender.OTHER, mike.genderPicker(3));
        assertEquals(Gender.FEMALE, mike.genderPicker(2));
        assertEquals(Gender.MALE, mike.genderPicker(1));
    }
}
