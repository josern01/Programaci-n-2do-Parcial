/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejarbol;

/**
 *
 * @author eq14
 */
public class Nodo {
    
    private int elemento;
    private Nodo ramaIz;
    private Nodo ramaDer;

    public Nodo(int elemento) {
        this.elemento = elemento;
        ramaIz=null;
        ramaDer=null;
    }
    
    public void InsertaBinario (int elem){ //DEFINE LAS ACCCIONES A VERIFICAR AL MOMENTO DE INSERTAR NODO
        if(elem<this.elemento){
            if(ramaIz == null)
                ramaIz = new Nodo (elem);
            else 
                ramaIz.InsertaBinario(elem);
                
        } else{
            if (elem>this.elemento){
                if(ramaDer==null)
                    ramaDer= new Nodo(elem);
                else 
                    ramaDer.InsertaBinario(elem);
            }
        }
        
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Nodo getRamaIz() {
        return ramaIz;
    }

    public void setRamaIz(Nodo ramaIz) {
        this.ramaIz = ramaIz;
    }

    public Nodo getRamaDer() {
        return ramaDer;
    }

    public void setRamaDer(Nodo ramaDer) {
        this.ramaDer = ramaDer;
    }

    @Override
    public String toString() {
        return "Nodo{" + "elemento=" + elemento + ", ramaIz=" + ramaIz + ", ramaDer=" + ramaDer + '}';
    }
    
    
    
    
    
}
