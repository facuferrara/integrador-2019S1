package ar.edu.unahur.obj2.ejercicio3;

public class Vendedor {

    private TipoVendedor tipoVendedor;


    public TipoVendedor getTipoVendedor() {
        return tipoVendedor;
    }
    public void setTipoVendedor(TipoVendedor tipoVendedor) {
        this.tipoVendedor = tipoVendedor;
    }

    public double comision(TipoVendedor tipoVendedor, double montoVenta) {

        tipoVendedor.porcentajeComision();
        return montoVenta*tipoVendedor.porcentajeComision();
    }
}