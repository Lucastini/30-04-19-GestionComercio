
package negocio;

public class Articulo {

    private int codigo;
    private static int cod=1;
    private String descripcion;
    private int stock;
    private double costoUnitario;
    private double porcGanancia;
    private boolean importado;

    public Articulo(String desc, double costUni, double porcGan, boolean impor){
        codigo=cod;
        cod++;
        descripcion=desc;
        stock=0;
        costoUnitario=costUni;
        porcGanancia=porcGan;
        importado=impor;        
    }
    
    public String descripcionImportado(){
        String res="Importado";
        if(!importado)
            res="No Importado";
        return res;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }
    public void AddUnidadesAlStock(int cant) {
        stock+=cant;
    }
    public void removeUnidadesDelStock(int cant){
        stock-=cant;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }
    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public double getPorcGanancia() {
        return porcGanancia;
    }
    public void setPorcGanancia(double porcGanancia) {
        this.porcGanancia = porcGanancia;
    }

    public boolean isImportado() {
        return importado;
    }
    public void setImportado(boolean importado) {
        this.importado = importado;
    }
    
    @Override
    public String toString(){
        
        return "Cod. Art.: "+codigo+", "+descripcion+", Costo Un.: $"+costoUnitario+", Ganancia: "+porcGanancia+"%, "+descripcionImportado()+", Stock: "+stock;
    }
    
    public double precioFinal(){
        return ((int)((costoUnitario+costoUnitario*porcGanancia/100d)*100))/100d;
        //return costoUnitario+costoUnitario*porcGanancia/100d;
    }
    
    public double capitalSegunStock(){
        return ((int)((stock*costoUnitario)*100))/100;
    }
    

    
}
