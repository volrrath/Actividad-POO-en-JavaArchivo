
package com.mycompany.proyecto_tiendita;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos
{
    ArrayList<Tienda> lista_tienda= new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    
    //agregar producto
    public void agregar(Tienda tienda)  
    {
       lista_tienda.add(tienda);
    }
    
    //Mostrar lista producto
    public void Mostrar()
    {        
        System.out.println("Lista productos");
        if (lista_tienda.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            for (int i = 0; i < largo_lista(); i++) {
                System.out.println("-. " + i +" "+ lista_tienda.get(i));
            }
        }
    }
    
    //compra y stock    
    public double compra(int cod2)
    {
      int can, resul;
      double resu=0;
      System.out.print("Ingrese cantidad a comprar: ");can=scan.nextInt();
      resul= lista_tienda.get(cod2).getStock()-can;
        if(can>lista_tienda.get(cod2).getStock())
        {
            System.out.println("No hay stock suficiente, actualemnete se cuenta con "+lista_tienda.get(cod2).getStock()+" unidades disponibles");
        }else
        {
            lista_tienda.get(cod2).setStock(resul);
            resu=(lista_tienda.get(cod2).getPrecio()*can);
        }
        return resu;
    }
     
       
    //validar que solo se ingresen letras
    public boolean validad_letras(String nombre)
    {
        boolean respuesta=(nombre.matches("[a-zA-Z]*"));
        if(respuesta==true)
        {
            System.out.println("Parametros correctos");
        }else
        {
            System.out.println("Parametros INVALIDOS");
        }
        return respuesta;
    } 
     
    //validar que solo se ingresen numeros
    public boolean validad_numero(String pasar)
    {
        boolean respuesta=(pasar.matches("[1-9]*"));
        return respuesta;
    }  
    
     //entrega el largo del Arraylist
    public int largo_lista()
     {
         int resultado=lista_tienda.size();
         return resultado;
     }
     
     //verifica si la lista se encuentra vacia
    public boolean lista_vacia()
     {
         boolean resultado= false;
         if(lista_tienda.isEmpty())
         {
             resultado=true;
         }
        return resultado;
     }
    
}
