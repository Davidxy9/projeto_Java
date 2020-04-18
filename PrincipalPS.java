import java.util.Scanner;

public class PrincipalPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public void Inicializar(Scanner entrada) {
		Scanner teclado = new Scanner(System.in);
		PilhaSequencial pilha = new PilhaSequencial();
		int comando= 0;
		int loop = 0;
		String nome = null;
		
		while(loop == 0) {
			System.out.println("\nA pilha está vazia? "+pilha.estaVazia());
			System.out.println("A pilha está cheia? "+pilha.estaCheia());
			System.out.println("Total de Elementos na pilha: "+pilha.quantidadeElementos()+ "\n");
			System.out.println("(1)Push (2)Pop (3)Exibir os elementos (4)Voltar\n");
			comando = teclado.nextInt();
			switch(comando){
				case 1://push(inserir elemento) 
					System.out.println("Insira o nome do elemento(push):");
					nome = teclado.next();
					pilha.push(nome);
					break;
				case 2://pop(remover elemento)
					String elementoremovido = pilha.pop();
					System.out.println("O elemento removido foi: "+elementoremovido);
					break;
				case 3: //exibir os elementos
					pilha.exibirElementos();
					break;
				case 4:
					loop = 1;
					break;
					
				default: System.out.println("Opção inválida!"); 
			
			
			
			}//do switch
			
		}//do while
		//teclado.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
