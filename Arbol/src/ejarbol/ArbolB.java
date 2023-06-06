/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejarbol;

public class ArbolB {

    Nodo padre;
    Nodo raiz;

    public ArbolB() {
        raiz = null;

    }

    public void InsertaNodo(int elem) {  //inserccion de un elemento en el arbol
        if (raiz == null) 
            raiz = new Nodo(elem);
        else 
            raiz.InsertaBinario(elem);
        
    }

   
    public void Preorden(Nodo Nodo) {
        if (Nodo == null) 
            return;
         else {
            System.out.println(Nodo.getElemento() + "");
            Preorden(Nodo.getRamaIz());
            Preorden(Nodo.getRamaDer());

        }
    }

    
    public void PostOrden(Nodo Nodo) {
        if (Nodo == null) 
            return;
         else {
            PostOrden(Nodo.getRamaIz());
            PostOrden(Nodo.getRamaDer());
            System.out.println(Nodo.getElemento() + "");

        }

    }
    public void Inorden(Nodo Nodo) {
        if (Nodo == null) 
            return;
         else {
            Inorden(Nodo.getRamaIz());
            System.out.println(Nodo.getElemento()+"");
            Inorden(Nodo.getRamaDer());
            
        }
}
   
    void Busqueda(int elem, Nodo A) {
    if (A == null) {
        System.out.println("El elemento no se encontró en el árbol.");
        return;
    } else if (A.getElemento() == elem) {
        System.out.println("El elemento se encontró en el árbol.");
        return;
    } else {
        if (elem > A.getElemento())
            Busqueda(elem, A.getRamaDer());
        else
            Busqueda(elem, A.getRamaIz());
    }
}
  
    public int Altura (Nodo Nodo){  //cuenta los niveles de arbol
        int Altder = (Nodo.getRamaDer() == null? 0:1 + Altura(Nodo.getRamaDer()));
        int Altizq = (Nodo.getRamaIz() == null? 0:1 + Altura(Nodo.getRamaDer()));
        return Math.max(Altder, Altizq);
    
    }
    
}