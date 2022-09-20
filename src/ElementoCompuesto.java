import java.util.ArrayList;
import java.util.List;

public class ElementoCompuesto implements Construible {

    //ATRIBUTO
    private List<Construible> construibleList;

    // CONSTRUCTOR CON ARRAY
    public ElementoCompuesto() {
        construibleList = new ArrayList<>();}

     // METODOS
    // METODO AGREGADOR ARRAY
    public void agregarConstruible (Construible construible) { construibleList.add(construible);}

    @Override
    public Double calcularArea() {
        Double sumaArea=0.0;
        for (Construible construible :  construibleList){
            sumaArea += construible.calcularArea();
        }
        return sumaArea;
    }
}

