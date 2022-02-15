package General;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Alberto
 */
public class C {
    int a;  int b;  int c; //Sigma 0
    public void m(){
    System.out.println(a+c);//Hace referecia a Sigma 0
    int j = a + b;          //Se crea Sigma 1
    String a="Hello";       //Se crea Sigma 2 -a String aniulando
    System.out.println(a);  //Temporalmente -a int-
    System.out.println(b);
    System.out.println(c);
    }//m
    public static void main (String[] args){
    C c = new C();
    c.m();
    System.out.println("Variable a-Global"+c.a);
    }//main
    
}
