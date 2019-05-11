
package negocio;

import java.util.LinkedList;

public class Venta {
    
    private int codigo;
    private static int cod=1;
    private String dni;
    private LinkedList<Item> detalleVenta;
    
    public Venta(String dni,LinkedList<Item> presupuesto){
        codigo=cod;
        cod++;
        this.dni=dni;
        detalleVenta=presupuesto;
        for(Item iter:detalleVenta){
            Articulo ar=iter.getArt();
            ar.removeUnidadesDelStock(iter.getCant());
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDni() {
        return dni;
    }

    public LinkedList<Item> getDetalleVenta() {
        return detalleVenta;
    }
    
    public double montoTotalVenta(){
        double res=0d;
        for(Item iter:detalleVenta)
            res+=iter.valorVentaItem();
        return res;
    }
    
    public String toString(){
        String aux="";
        boolean primero=true;
        for(Item iter:detalleVenta){
            if(primero)
                aux+=iter;
            else
                aux+=" / "+iter;
        }
        return "Cod.: "+codigo+", Items: "+aux;
    }
    
    
}
