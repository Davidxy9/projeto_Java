

// Aqui estarão as funções de nossa lista
public class Lista {
	Contato[] contatos = new Contato[10];
	int tamanho = 0; // tamanho de nossa lista no qual iniciamos em 0 
	
	public boolean estaVazia() { //função que vê se a lista está vazia
		return(tamanho == 0);
	}
	
	public boolean estaCheia() { // função que vê se a lista está cheia
		return(tamanho == contatos.length);
	}
	public int tamanhoLista() { //nos diz o tamanho da lista através da variável tamanho
		return tamanho;
	}
	
	public Contato buscar(int pos) { //função que obtem o elemento de uma determinada posição na lista 
		
		if (pos < 0 || pos >= tamanho)
			return null;
		
		return contatos[pos];
	}
	
	public boolean Compara(Contato c1, Contato c2) {  // compara se os dois contatos são iguais
		return(c1.nome.equals(c2.nome));
	}
	
	public int retornarPosicao(Contato contato) {
		for (int i = 0; i <= tamanho; i++)
			if (Compara(contatos[i], contato))
				return i;
		return -1;
	}
	
	public void deslocarParaDireita(int pos) {
		for (int i = tamanho; i > pos; i--)
			contatos[i] = contatos[i - 1];
	}
	
	public boolean inserirContato (int pos, Contato c1) {
		if (estaCheia() || (pos > tamanho) || (pos < 0))
			return false;
		deslocarParaDireita(pos);
		contatos[pos] = c1;
		tamanho++;
		return true;
	}
	
	public void deslocarParaEsquerda(int pos) {
		for (int i = pos; i < (tamanho - 1); i++)
			contatos[i] = contatos[i + 1];
	}
	
	public boolean removerContato (int pos) {
		if ((pos > tamanho) || (pos < 0))
			return false;
		deslocarParaEsquerda(pos);
		tamanho--;
		return true;
	}
	
	public void exibirLista() {
		for (int i = 0; i < tamanho; i++)
			System.out.println(	"\nContato " +(i + 1)
								+"\nNome: " +contatos[i].nome);
	}

		
	
	
}
