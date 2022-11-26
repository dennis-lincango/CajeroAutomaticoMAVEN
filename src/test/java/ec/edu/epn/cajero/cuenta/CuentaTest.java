package ec.edu.epn.cajero.cuenta;

import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaTest {

@Test
     public void given_aBalance_when_consultarSaldo_then_ok() {
        //knowing that the default value of one account is
        //cajero.put("4271900557374142", 27.2F);
        Cuenta cuenta = new Cuenta();
        float expected = 27.2F;
        float actual = cuenta.consultarSaldo("4271900557374142");
        //The maximum value of eeror doesn't have to be more than 0.0F
        //because we are managging money.
        assertEquals(expected, actual,0.0F);
    }
    @Test
    public void given_Number_when_isFloat_then_ERROR() {
        assertFalse(Cuenta.isFloat("a27.2"));
    }

}

