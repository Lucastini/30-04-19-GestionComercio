
package negocio;

import java.util.LinkedList;

public class PedidoEnConstruccion {
    
    private LinkedList<Item> detallePedido;
    
    public PedidoEnConstruccion(){
        detallePedido=new LinkedList();
    }
    
    public boolean addItem(Item i){
        return detallePedido.add(i);
    }
    public boolean removeItem(Item i){
        return detallePedido.remove(i);
    }

    public LinkedList<Item> getDetallePedido(){
        return detallePedido;
    }
    
    public double montoTotalPedido(){
        double res=0f;
        for(Item iter: detallePedido)
            res+=iter.valorCompraItem();
        return res;
    }
    
}
