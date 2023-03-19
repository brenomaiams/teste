import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite uma string: ");
        String original = ler.nextLine();
        
        
        char[] chars = original.toCharArray();
        
        
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        
        
        String reversed = new String(chars);
        
        
        System.out.println("A string invertida é: " + reversed);
    }
}