/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao;

/**
 *
 * @author wande
 */
public class TesteFuncao {
    //static void soma (int a, int b){
        static int soma (int a, int b){
        int s = a+b;
        //System.out.println("A soma entre os valores é: "+s);
        return s;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Começou o programa ");
        //soma(5,2);
        int sm = soma(5,2);
        System.out.println("A soma é: "+sm);
        // TODO code application logic here
    }
    
}
