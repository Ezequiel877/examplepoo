public class Rectangulo implements Construible {

    private Double largo;
    private Double alto;

    public Rectangulo(Double largo, Double alto) {
        this.largo = largo;
        this.alto = alto;
    }


    @Override
    public Double calcularArea() {
        Double areaRectangulo = this.largo*this.alto;
        return areaRectangulo;
    }
}
