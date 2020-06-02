/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotipolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eliasim
 */
public class EjemploTipoList {
    
    public EjemploTipoList(){

        principal();
        
}
    
    public void principal(){
    
        List<datos> lista = new ArrayList<>();
        datos Datos = new datos();
        
        Datos.setNombre("Eliasim");
        Datos.setEdad(20);
        
        lista.add(Datos);
        
        Datos = new datos();
        
        Datos.setNombre("Fernando");
        Datos.setEdad(25);
        
        lista.add(Datos);
        
        Datos = new datos();
        
        Datos.setNombre("Javier");
        Datos.setEdad(30);
        
        lista.add(Datos);
        
        lista.forEach(elemento -> {
            System.out.println("Nombre " + elemento.getNombre());
            System.out.println("Edad " + elemento.getEdad());
        });
        System.out.println("\n\nOtra forma de recorrer los datos");
        
        for (datos contenido: lista){
            System.out.println("Nombre " + contenido.getNombre());
            System.out.println("Edad " + contenido.getEdad());
            
        }
        
        Datos = new datos();
        
        Datos.setNombre("Gustavo");
        Datos.setEdad(19);
        
        lista.add(Datos);
        
        System.out.println("\n\nTercera forma de ver el contenido");
        
        lista.stream().forEach((valores) ->{
            System.out.println("Nombre " + valores.getNombre());
            System.out.println("Edad " + valores.getEdad());
            
            if (valores.getNombre().equals("Fernando")){
            System.out.println("Se encontro el dato...");
            }
        });
        
        }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new EjemploTipoList();
        
    }
    
}
