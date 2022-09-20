public class Circulo implements Construible{

    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {

        Double areaCirculo = this.radio*this.radio*Math.PI;

        return areaCirculo;
    }
}
