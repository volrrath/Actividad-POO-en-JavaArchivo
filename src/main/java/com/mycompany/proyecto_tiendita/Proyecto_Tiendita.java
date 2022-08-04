package com.mycompany.proyecto_tiendita;

import java.util.Scanner;

public class Proyecto_Tiendita {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 
        Metodos metodo= new Metodos();
        int op=0;  
        String pasar;
        String opcion;
        String letra="s";
        
         do{
            System.out.println("*** Menu Principal ***");
            System.out.println("----------------------");
            System.out.println("1.- Agregar Producto");
            System.out.println("2.- Nota 1- Mostrar, nombre, precio, stock");
            System.out.println("3.- Nota 2-3 comprar y stock productos");
            System.out.println("4.- Salir");
             
            do{  
                System.out.print("ingrese una opcion valida 1/4: ");pasar=scan.next();                
                if(metodo.validad_numero(pasar)==true)
                {
                    op=Integer.parseInt(pasar);
                }else
                {
                    System.out.println("los parametros ingresados no corresponden");
                }                                
            }while(op<0 || op>4);
            
                switch (op)
                    {
                        case 1:   
                            String nombre_producto;
                            double precio;
                            int stock;
                                    
                                do{                       
                                    System.out.println("*** Ingreso Producto ***");
                                    do{
                                        System.out.print("Ingrese nombre producto: ");nombre_producto=scan.next();
                                    }while(metodo.validad_letras(nombre_producto)==false);
                                      System.out.print("Ingrese precio: ");precio=scan.nextDouble();
                                      System.out.print("Ingrese stock: ");stock=scan.nextInt();
                                      Tienda tienda= new Tienda(nombre_producto, precio, stock);
                                      metodo.agregar(tienda); 
                               
                                      System.out.println("Si desea Comprar otro producto presione la tecla S ");
                                      System.out.print("en caso contrario presiones cualquier tecla: ");opcion=scan.next();
                                }while(opcion.equalsIgnoreCase(letra)); 
                        break;                     

                        case 2:
                            metodo.Mostrar();
                        break; 
                        
                        case 3:
                            int cod2;
                            double total=0;                            
                            if(metodo.lista_vacia()== false)
                            {
                                do{
                                    metodo.Mostrar();
                                    do{
                                        System.out.print("ingrese el codigo del profucto a elegir: ");cod2=scan.nextInt();
                                    }while(cod2 >= metodo.largo_lista() || cod2<0);
                                    //metodo.compra(cod2); 
                                    total=total+metodo.compra(cod2);
                            
                                    System.out.println("Si desea Comprar otro producto presione la tecla S ");
                                    System.out.print("en caso contrario presiones cualquier tecla: ");opcion=scan.next();
                                }while(opcion.equalsIgnoreCase(letra));                            
                            }else
                            {
                                System.out.println("lista vacia");
                            }
                            System.out.println("El total a pagar es: "+total);
                        break;
                        
                        case 4:
                             System.exit(0); 
                        break;                
                    }                   
        }while(op<=4); 
    }
}
