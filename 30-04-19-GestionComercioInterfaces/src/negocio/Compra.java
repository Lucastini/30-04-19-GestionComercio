
package negocio;

import java.util.LinkedList;

public class Compra {
    private int codigo;
    private static int cod=1;
    private LinkedList<Item> detalleCompra;
    
    public Compra(LinkedList<Item> pedido){
        codigo=cod;
        cod++;
        detalleCompra=pedido;
        for(Item iter:detalleCompra){
            Articulo ar=iter.getArt();
            ar.AddUnidadesAlStock(iter.getCant());
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public LinkedList<Item> getDetalleCompra() {
        return detalleCompra;
    }
    
    public String toString(){
        String aux="";
        boolean primero=true;
        for(Item iter:detalleCompra){
            if(primero)
                aux+=iter;
            else
                aux+=" / "+iter;
        }
        return "Cod.: "+codigo+", Items: "+aux;
    }
    
    public double montoTotalCompra(){
        double res=0d;
        for(Item iter:detalleCompra)
            res+=iter.valorCompraItem();
        return res;
    }
    
}
