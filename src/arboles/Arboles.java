/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author usuario
 */
public class Arboles {

    Nodo raiz;
    
    public static void main(String[] args) {
       Arboles a=new Arboles(3);
       String linea; 
       
       try {
            BufferedReader br= new BufferedReader (new FileReader("C:\\Users\\usuario\\Documents\\arbol.txt"));
           
            linea = br.readLine();
            
            while(linea!=null)
            {
                System.out.println(linea);
                linea=br.readLine();
                
            }
            br.close();
           
            
        } catch (Exception e) 
        {System.out.println(e);
        }
    }
    
    public Arboles(int info){
        raiz=new Nodo(info);
    }
    
    boolean Vacio(){
        return raiz==null;
    }
    
    void AgregarNodo(Nodo dato,Nodo raiz)
    {   if(Vacio())
            raiz=new Nodo(dato.info);
        else
        {
                if(dato.info<raiz.info)
                   if (raiz.izquierda==null) 
                       raiz.izquierda=new Nodo(dato.info);
                   else
                       AgregarNodo(dato, raiz.izquierda);
                
                else
                    if (raiz.derecha==null) 
                       raiz.derecha=new Nodo(dato.info);
                    else
                        AgregarNodo(dato, raiz.derecha);
                            
        }
    }
    void AgregarNodo(Nodo nodo){
        AgregarNodo(nodo, raiz);
    }
    void Eliminar(int dato){
        
    }
    void recPreorden(){
        
    }
    void recInorden(){
        
    }
    void recPostorden(){
        
    }
    
    Nodo Buscar(String busca)
    {
        Nodo ab=raiz;
        while(ab!=null)
        {
            
        }
        //modificar no es el valor real
        return null;
    }
    
}
