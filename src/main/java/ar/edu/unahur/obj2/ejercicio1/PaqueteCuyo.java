package ar.edu.unahur.obj2.ejercicio1;

public class PaqueteCuyo extends SuperPackage{


    public String getNombre() {
        return "Paquete Cuyo";
    }

    public void imprimirItinerario() {
        print("Nombre: " + getNombre());
        print("Transporte Ida: " + transporteIda());
        print("Dia 1: " + dia1());
        print("Dia 2: " + dia2());
        print("Dia 3: " + dia3());
        print("Transporte Vuelta: " + transporteVuelta());
    }

    private void print(String texto) {
        System.out.println(texto);
    }


    protected String transporteIda() {
        return "Traslado desde el aeropuerto de Mendoza al hotel San Martin";
    }

    protected String dia1() {
        return "Visita ciudad de Mendoza";
    }

    protected String dia2() {
        return "Circuito Vitivinicola";
    }

    protected String dia3() {
        return "Visita chapelco";
    }

    protected String transporteVuelta() {
        return "Traslado desde el hotel San Martin al aeropuerto de Mendoza";
    }

}
