package ar.edu.unahur.obj2.ejercicio1;

import java.util.List;

public class AgenciaDeViajes {

    private PaqueteCuyo paqueteCuyo;
    private PaqueteNOA paqueteNOA;
    private PaquetePatagonia paquetePatagonia;
    private List<Paquetes>paquetes;

    public AgenciaDeViajes(PaqueteCuyo paqueteCuyo, PaqueteNOA paqueteNOA, PaquetePatagonia paquetePatagonia) {
        this.paqueteCuyo = paqueteCuyo;
        this.paqueteNOA = paqueteNOA;
        this.paquetePatagonia = paquetePatagonia;
    }

    public void catalogoDePaquetes() {

        paquetes.stream().forEach(p -> p.imprimir());
    }

}
