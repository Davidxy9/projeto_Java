import java.util.Scanner;
// intera��o usu�rio/lista encadeada
public class PrincipalE extends ListaE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public void Inicializar(Scanner entrada) {
		ListaE listaencadeada = new ListaE (); 
		Scanner teclado = new Scanner(System.in);
		int loop = 0; //respons�vel pelo loop do menu
		int comando = 0; // respons�vel pela escolha do menu
		//int tam = 10; 
		int primeira = 0; 
		String nome = null; 
		//System.out.println("A lista est� vazia? "+listaencadeada.estaVazia());
		
		
		while(loop == 0) {
			System.out.println("A lista est� vazia? "+listaencadeada.estaVazia());
			System.out.println("(1)Inserir elemento (2)remover um elemento (3)Exibir os elementos (4)Voltar\n");
			comando = teclado.nextInt();
			
			switch(comando){
				case 1: //inserir elemento
						AlunoE novo = new AlunoE(); //instacia a classe AlunoE
						
						System.out.println("Insira o elemento: ");
						nome = teclado.next();
						novo.setNome(nome);
						listaencadeada.inserirAlunoInicio(novo);
						if(primeira == 1) {
							listaencadeada.inserirNoFim(novo);	
						}
					break;
				case 2: //remover elemento
					String delete = null;
					System.out.println("Digite o nome que deseja excluir:");
					delete = teclado.next();
					listaencadeada.removerAlunoPorNome(delete);
					System.out.println("O nome foi excluido!");
					
					break;
				case 3: //exibir a lista encadeada
					listaencadeada.exibirLista();
					break;
				case 4:
					loop = 1;
					break;
				
				default: System.out.println("Op��o inv�lida!"); 
			} //do switch
			//teclado.close();
		} //do while
		
		
		
		
		
		
		
		
	}
}
