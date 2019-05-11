
package negocio;

import java.util.LinkedList;

public class Comercio {
    
    private String razonSocial;
    private LinkedList<Articulo> listaArticulos;
    private LinkedList<Compra> listadoCompras;
    private LinkedList<Venta> listadoVentas;
    
    public Comercio(String rz){
        razonSocial=rz;
        listaArticulos=new LinkedList();
        listadoCompras=new LinkedList();
        listadoVentas=new LinkedList();
    }

    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public LinkedList<Articulo> getListaArticulos() {
        return listaArticulos;
    }
    
    private Articulo buscarArticuloXDescripcion(String desc){
        Articulo res=null;
        for(Articulo iter: listaArticulos)
            if(iter.getDescripcion().equalsIgnoreCase(desc))
                res=iter;
        return res;
    }
    
    public boolean addArticulo(Articulo art){
        boolean seAgrego=false;
        String descNuevoArt=art.getDescripcion();
        if(buscarArticuloXDescripcion(descNuevoArt)==null)
            seAgrego=listaArticulos.add(art);
        return seAgrego;
    }
    
    public boolean removeArticulo(Articulo art){
        boolean seBorro=false;
        
        return seBorro;
    }
    
    public boolean addCompra(Compra c){
        return listadoCompras.add(c);
        //El Stock ya se actualiza con el new Compra que genero codigo=NºFactura
    }
    
    public boolean addVenta(Venta v){
        return listadoVentas.add(v);
        //El Stock ya se actualiza con el new Venta que genero codigo=NºFactura
    }

    public LinkedList<Compra> getListadoCompras() {
        return listadoCompras;
    }

    public LinkedList<Venta> getListadoVentas() {
        return listadoVentas;
    }
    
    public double capitalTotalSegunStockArticulos(){
        double res=0d;
        for(Articulo iter:listaArticulos)
            res+=iter.capitalSegunStock();
        return res;
}
    
    
    
    
}
