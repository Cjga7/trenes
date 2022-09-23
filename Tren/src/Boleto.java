public class Boleto {
    Tren tren;
    Trayecto trayecto;
    Tramo tramo;
    Integer tramoVagon;
    Integer fila;
    Character posicion;
    public Boleto(){

    }

    public Boleto(Tren tren, Trayecto trayecto, Tramo tramo, Integer tramoVagon, Integer fila, Character posicion) {
        this.tren = tren;
        this.trayecto = trayecto;
        this.tramo = tramo;
        this.tramoVagon = tramoVagon;
        this.fila = fila;
        this.posicion = posicion;
    }
}
