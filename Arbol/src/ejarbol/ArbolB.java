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
        if (raiz == null) {
            raiz = new Nodo(elem);
        } else {
            raiz.InsertaBinario(elem);
        }
    }

    //rescorrido preorden recursivo del arbol
    public void Preorden(Nodo Nodo) {
        if (Nodo == null) {
            return;
        } else {
            System.out.println(Nodo.getElemento() + "");
            Preorden(Nodo.getRamaIz());
            Preorden(Nodo.getRamaDer());

        }
    }

    //PostOrden recursivo del arbol
    public void PostOrden(Nodo Nodo) {
        if (Nodo == null) {
            return;
        } else {
            PostOrden(Nodo.getRamaIz());
            PostOrden(Nodo.getRamaDer());
            System.out.println(Nodo.getElemento() + "");

        }

    }
    public void InOrden(Nodo Nodo) {
        if (Nodo == null) {
            return;
        } else {
            InOrden(Nodo.getRamaIz());
            System.out.println(Nodo.getElemento()+"");
            InOrden(Nodo.getRamaDer());
            
        }
}
    //busqueda un elemento en un arbol
    void Busqueda (int Elem, Nodo A){
        if((A==null)| (A.getElemento()== Elem)){
            System.out.println(A.getElemento()+"");
            return;
            
        } else{
            if(Elem>A.getElemento()) Busqueda (Elem, A.getRamaDer());
            else Busqueda (Elem, A.getRamaIz());
        }
        
    }
    // Altura de arbol
    public void Altura (Nodo Nodo){  //cuenta los niveles de arbol
//        int Altder = (Nodo.getRamaDer() == null? 0:1 + Altura(Nodo.getRamaDer()));
//        int Altizq = (Nodo.getRamaIz() == null? 0:1 + Altura(Nodo.getRamaDer()));
    
    }
    
}