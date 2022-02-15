/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

/**
 *
 * @author Carlos Alberto
 */

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
    // Atributos
    Hashtable tablaSimbolos;
    //Métodos
    HashTable(){
        tablaSimbolos=new Hashtable();
    }
    
    public void inserta(int idSimbolo, String simbolo){
        tablaSimbolos.put(idSimbolo, simbolo);
    }//inserta
    public void imprime(int idSimbolo){
        System.out.println(tablaSimbolos.get(idSimbolo));
    }//imprime
    public void mostrarSimbolos(){
        Enumeration enumeration = tablaSimbolos.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(""+"Hashtable lexemas: " + enumeration.nextElement());
            }//while
    }//mostrarSimbolos
    public void mostrarLlaves(){
        Enumeration llaves = tablaSimbolos.keys();
        while (llaves.hasMoreElements()) {
            System.out.println(""+"hashtable ids: " + llaves.nextElement());
        }//while
    }//mostrarLlaves
    public void mostrarTodasLlaves(){
        System.out.println("Claves: " +tablaSimbolos.keySet()+" ");
    }
    public static void main(String[] args) {
        HashTable t = new HashTable();
        //AGREGAR 10 LEXEMAS DE SU COMPILADOR
        t.inserta(1, "si");
        t.inserta(2, "sino");
        t.inserta(3, "a1");
        t.inserta(4, "entero");
        t.inserta(5, "entrada");
        t.inserta(6, "booleano");
        t.inserta(7, "buzzer");
        t.inserta(8, "escribe");
        t.inserta(9, "espera");
        t.inserta(10, "para");
        //
        t.imprime(3);
        //Mostrar símbolos
        System.out.println("-----------Visualización de los elementos de la tabla-----------");
        t.mostrarSimbolos(); 
         //Visualizar llaves
        System.out.println("-----------Visualización de llaves de HashTable ----------------");
        t.mostrarLlaves();
        //
        System.out.println("-----------Visualización de TODAS llaves de HashTable ----------------");
        t.mostrarTodasLlaves();
    }
}//HashTable
