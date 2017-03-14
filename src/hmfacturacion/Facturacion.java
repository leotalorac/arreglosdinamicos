/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmfacturacion;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factura f = new Factura(1);
        Producto p;
        String n;
        double v;
        for (int i = 0; i < 2; i++) {
            System.out.println("ingresa el nombre del producto");
             n = sc.next();
            System.out.println("ingresa el valor");
            v = sc.nextDouble();
            p = new Producto(n,v);
            f.addProducto(p);
        }
        f.listar();
        Producto b = f.buscar("empanada");
        if(b != null){
            System.out.println("Precio "+ b.getPrecio());
        }
        
    }
    
}
