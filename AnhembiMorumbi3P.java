/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anhembimorumbi3p;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class AnhembiMorumbi3P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 0;

        Scanner n = new Scanner(System.in);
        System.out.println("Digite o número para ver se é primo");
        
        int num = n.nextInt();

        while (cont <= num){
            if(num % cont == 0 && (cont != 1 || cont == num)){
                System.out.println("O numero" + n + "é primo");
            } else {
                System.out.println("O número" + n + "N é primo");
            }
        }
    }
    
}
