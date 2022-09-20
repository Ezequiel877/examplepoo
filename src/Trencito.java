import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Trencito {

    private List<Construible> construibleList;

    // CONSTRUCTOR CON ARRAY
    public Trencito() {
        construibleList = new ArrayList<>();
    }
    // METODO AGREGADOR ARRAY
    public void agregarATrencito (Construible construible) { construibleList.add(construible);}

    public Double calcularArea(){
        Double areaTren = 0.0;

        for (Construible construible : construibleList){
            areaTren += construible.calcularArea();
        }
        return areaTren;
    }
}
