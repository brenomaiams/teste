/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unifio.edu.br.fibonacci;

import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um número");
        int num = ler.nextInt();
        
        int n1 = 0;
        int n2 = 1;
        
        while (n1 < num) {
            int temp = n1;
            n1 = n2;
            n2 = temp + n2;
        }
        
        if (n2 == num) {
            System.out.println("O número: " + num + " pertence a sequência");
        } else {
            System.out.println("O número: " + num + " não pertence a sequência");
        }
        ler.close();
    }
}
