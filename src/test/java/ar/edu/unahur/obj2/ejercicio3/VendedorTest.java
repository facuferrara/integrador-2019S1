package ar.edu.unahur.obj2.ejercicio3;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VendedorTest {

     Vendedor Principiante;
     Vendedor Senior;
     Vendedor Experto;

    @BeforeMethod
    public void setUp() {
        Principiante = new Vendedor();
        Senior = new Vendedor();
        Experto = new Vendedor();
    }

    @Test
    public void testComisionPrincipiante() {
        TipoVendedor tipoVendedor = new Principiante();
        Assert.assertEquals(tipoVendedor.porcentajeComision(), 0.10);
    }

    @Test
    public void testComisionSenior() {

        TipoVendedor tipoVendedor = new Senior();
        Assert.assertEquals(tipoVendedor.porcentajeComision(), 0.20);
    }

    @Test
    public void testComisionExperto() {
        TipoVendedor tipoVendedor = new Experto();
        Assert.assertEquals(tipoVendedor.porcentajeComision(), 0.40);
    }
}