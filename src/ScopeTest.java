public class ScopeTest {
    
    public static void main(String[] args) {
        int i = 0;
        
        // Corrigido: Mudando o nome da variável de 'i' para 'x'
        for(int x = 64; x > 0; x = x / 2 ){
            System.out.print(x + " ");
        }
        
        System.out.println("\n" + i);  // Imprime o valor de 'i' inicializado fora do loop

        System.out.println("");
        for(int j = 0; j <= 5; j++){
            System.out.print(j + " ");
        }
        
        System.out.println("");
        for(int j = 5; j >= 0; j--){
            System.out.print(j + " ");
        }
        
        System.out.println("");
        for(int k = 2; k <= 64; k = k * 2){
            System.out.print(k + " ");
        }
    }  
}