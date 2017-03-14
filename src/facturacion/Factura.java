/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Factura {
    private int id;
    private ArrayList<Producto> b;
    
    public Factura(int id){
        //inicializar el array solo el tipo de dato producto
        this.b = new ArrayList<>();
    }
    
    public void addProducto(Producto p){
        //adicionar un elemento
        this.b.add(p);
    }
    
    public double CalcularTotal(){
        double total = 0;
        for (int i = 0; i < this.b.size(); i++) {
            //obtener  elemento
            Producto p = this.b.get(i);
            total+= p.getPrecio();
        }
        //o
        /*for(Producto p : b){
            total+=p.getPrecio();
        }*/
        return total;
    }
    
    public void listar(){
        for (int i = 0; i < this.b.size(); i++) {
            System.out.println("Producto " + this.b.get(i).getNombre() + " valor: " +this.b.get(i).getPrecio() );
            
        }
    }
    
    public Producto buscar(String n){
        //for para recorrer Array list
        for (Producto b : b) {
            //comparar strings 
            if(b.getNombre().equals(n)){
                return b;
            }  
        }
        return null;
    }
    
}
