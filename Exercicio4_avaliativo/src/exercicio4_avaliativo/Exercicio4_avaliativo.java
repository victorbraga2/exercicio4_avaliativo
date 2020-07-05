/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_avaliativo;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio4_avaliativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner result = new Scanner (System.in);
        int i;
        double a, b, c;
        System.out.println("Digte um 1 ou 2 para a i: ");
        i = result.nextInt();
        System.out.println("Digite o valor de a: ");
        a = result.nextDouble();
        System.out.println("Digite o valor de b: ");
        b= result.nextDouble();
        System.out.println("Digite o valor de c: ");
        c= result.nextDouble();
        
        if (i == 1)
        {
        System.out.println(+a +"\n"+b+"\n"+a);
        }
        
        else
        {
        if (i == 2)
        {
        System.out.println(+c +"\n"+b+"\n"+a);
        }
        }

        
    }

}
