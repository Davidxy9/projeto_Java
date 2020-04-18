import java.util.Scanner;

//Aqui estará nossa interação usuário/lista
public class Principal {
	//static Menu menu1 = new Menu();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public void Inicializar(Scanner entrada) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Lista listasequencial = new Lista(); //criamos a nossa lista
		int comando= 0;
		int loop = 0;
			
		while(loop == 0) {
			System.out.println("\nA lista esta vazia? "+ listasequencial.estaVazia());
			System.out.println("A lista esta cheia? "+ listasequencial.estaCheia());
			System.out.println("A lista tem "+ listasequencial.tamanhoLista() +" elementos\n");
			System.out.println("(1)Inserir elemento (2)remover um elemento (3)Exibir os elementos (4)Voltar\n");
			comando = teclado.nextInt();
			switch(comando){
				case 1: //inserir elementos
					teclado.nextLine();
					System.out.println("Quantas usuários deseja inserir?");
					int tam = teclado.nextInt();
					if(tam > 10 || tam < 1) {
						System.out.println("tamanho inválido! Tente números de 1 a 10");
					}else {
						teclado.nextLine();
						System.out.println("Digite os elementos que deseja inserir:");
						Contato[] contatos = new Contato[10];
						for (int i = 0; i < tam; i++) {
                	
							contatos[i] = new Contato();
							contatos[i].nome = teclado.nextLine();
                    
							listasequencial.inserirContato(i, contatos[i]);
						}
					} // do else
					break;
				case 2: //remover elementos
					System.out.println("De 0 a 9 que posição você deseja retirar?");
					int posicao = teclado.nextInt(); 
					listasequencial.removerContato(posicao);
					break;
				case 3://exibir os elementos
					listasequencial.exibirLista();
				
					break;
				case 4: //voltar ao menu
					loop = 1;
					break;
					
				default: System.out.println("Opção inválida!"); 
			} //do switch
		}//do while
		System.out.println(" ");
		//teclado.close();
	}//do void iniciar
} //do Principal

