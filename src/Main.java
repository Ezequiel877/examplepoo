public class
Main {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(5.0,4.0);
        Rectangulo rectangulo2= new Rectangulo(6.0,4.0);
        Circulo circulo1 = new Circulo(1.0);
        Triangulo triangulo1 = new Triangulo(2.0,2.0);

        ElementoCompuesto vagon = new ElementoCompuesto();
        vagon.agregarConstruible(rectangulo1);
        vagon.agregarConstruible(circulo1);
        vagon.agregarConstruible(circulo1);

        ElementoCompuesto locomotora = new ElementoCompuesto();
        locomotora.agregarConstruible(rectangulo2);
        locomotora.agregarConstruible(triangulo1);
        locomotora.agregarConstruible(circulo1);
        locomotora.agregarConstruible(circulo1);

        Trencito trencito = new Trencito();
        trencito.agregarATrencito(vagon);
        trencito.agregarATrencito(locomotora);


        System.out.println(" El area total de tren es de  "+trencito.calcularArea()+" cm2");



    }
}