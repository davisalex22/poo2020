package Ventanas;
/**
 * Proyecto Bimestral Programación Orientada a Objetos
 * @author davisalex22
 */
public class Stock {
    
  // Declaracion de Variables
     String ID_Producto,NombreProducto,Cantidad,Precio;
    
    /**
     * Método Constructor de la clase Stock
     * @param ID_Producto
     * @param NombreProducto
     * @param Cantidad
     * @param Precio 
     */ 
    public Stock(String ID_Producto, String NombreProducto, String Cantidad, String Precio) {
        this.ID_Producto = ID_Producto;
        this.NombreProducto = NombreProducto;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }

    // Métodos get y set de la clase Stock
    public String getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(String ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }    
}
