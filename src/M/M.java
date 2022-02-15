/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M;

/**
 *
 * @author Carlos Alberto
 */
class E{
   static int a=5;
}
class N{
 static int b= 10;
 static int a= E.a+b;
}
class D{
 static int d=E.a+N.a;
}