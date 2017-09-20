/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alan
 */
public class FibonacciT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FibonacciT objfibo= new FibonacciT(); 
         System.out.println ("la sucesion Fibonaccit 12 mediante recursividad es "+
                 objfibo.FibonacciRecursivo(12));
         System.out.println ("la sucesion Fibonaccit 12 mediante ciclo es "+
                 objfibo.FibonacciCiclo(12));
    }
    // CREANDO EL METODO RECURSIVO PARA LA SUCESION  FIBONACCI
    public int FibonacciRecursivo(int n){
        if (n==1|| n ==2){
            //CASO BASE (RESPUESTA)
            return 1;
             
        }else{
             // dominio problema -1
             return FibonacciRecursivo(n-1)+ FibonacciRecursivo(n-2);
        
        }
    }
    // CREANDO EL METODO CON CICLO PARA LA SUCESION FIBONACCI
    public int FibonacciCiclo(int n){
        int fibo=0,primero=1,segundo=0;
        while(n>0){
            
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            n--;
            
        }
        return fibo;
    }
}
