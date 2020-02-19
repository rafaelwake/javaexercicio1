import java.util.Scanner;

/*	Exercício
 * 	Crie uma aplicação console que deverá ler 4 valores numéricos 
 * 	e apresentar o maior e o menor.
 */

public class Exercicio1 {

public static void main(String[] args) {  

    Scanner sc = new Scanner (System.in);  
    int valor[] = new int[4];  
    int maior = valor[0], menor = Integer.MAX_VALUE;   
      
    for(int i = 0; i < valor.length; i++){  
        System.out.print("Digite o " +(i+1)+"º valor: ");  
        valor[i] = sc.nextInt();  
        if(valor[i] > maior){   
            maior = valor[i];  
        }  
    }  
    for (int j = 0; j < valor.length; j++) {  
        if(valor[j] < menor){  
            menor = valor[j];  
        }  
    }  
    System.out.println("Maior valor = "+ maior);  
    System.out.println("Menor valor = "+ menor);  
    
    if (maior > 50){
        System.out.println("Valor muito alto");
    }
    
}
 
}