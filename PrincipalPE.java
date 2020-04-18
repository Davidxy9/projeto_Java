import java.util.Scanner;

public class PrincipalPE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public void Inicializar(Scanner entrada) {
		Scanner teclado = new Scanner(System.in);
		PilhaEncadeada pilha = new PilhaEncadeada();
		int loop = 0; //responsável pelo loop do menu
		int comando = 0; // responsável pela escolha do menu
		
		
		while(loop == 0) {
			System.out.println("\nA pilha está vazia? "+pilha.estaVazia());
			System.out.println("Total de elementos na pilha: "+pilha.quantidadeElementos());
			System.out.println("(1)Push (2)Pop (3)Exibir os elementos (4)Voltar\n");
			comando = teclado.nextInt();
			
			switch(comando){
				case 1://push(inserir elemento) 
					System.out.println("Insira o nome do elemento(push):");
					AlunoPE novo = new AlunoPE();
					String nome = teclado.next();
					novo.setNome(nome);
					pilha.push(novo);
					break;
				case 2://pop(remover elemento)
					AlunoPE alunoremovido = pilha.pop();
					System.out.println("O aluno removido foi: "+alunoremovido.getNome());
					break;
				case 3://exibir os elementos
					pilha.exibirAlunos();
					break;
				case 4:
					loop = 1;
					break;
					
				default: System.out.println("Opção inválida!"); 
			
			}//do switch
		}// do while
		//teclado.close();
		
		
		
		
	}

}
