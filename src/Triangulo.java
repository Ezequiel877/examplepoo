public class Triangulo implements Construible{

    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public Double calcularArea() {

        Double areaTriangulo = (this.base*this.altura)/2;
        return areaTriangulo;
    }
}
