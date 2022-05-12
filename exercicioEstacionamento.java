import java.util.Scanner;
//importando a biblioteca scanner.

 class Estaciomento
 
 {
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        //criando o scanner.
        
        System.out.print("Digite o numero 1 se voce for gestante,deficiente, idosa// ou 2 para nenhuma das opcoes: "); 
        //mensagem que ira aparecer para o usuario.
        
        int Num;
        Num = ler.nextInt();
        //criando uma variavel.
        
        if (Num==1)
        //criando uma condicao.
        { 
            System.out.printf("voce pode estacionar na vaga especial");
            //se a resposta for verdadeira a tela exibe essa mensagem.
        }
        
        else      
            System.out.printf("voce nao pode estacionar na vaga especial");
            //se a resposta for falsa a tela exibe essa mensagem.
     }   
}

