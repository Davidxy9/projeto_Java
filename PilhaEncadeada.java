//funções da pilha encadeada
public class PilhaEncadeada {
	AlunoPE	topo;
	int		quantidade = 0;
	
	public boolean estaVazia() {
		return (topo == null);
	}
	
	public int quantidadeElementos() {
		return quantidade;
	}
	
	public AlunoPE top () {
		if (estaVazia())
			return null;
		
		return (topo);
	}
	
	public void push(AlunoPE a) {
		a.proximo = topo;
		topo = a;
		quantidade++;
	}
	
	public AlunoPE pop () {
		if (estaVazia())
			return null;
			
		AlunoPE aux = topo;
		topo = topo.proximo;
		quantidade--;
		return aux;
	}
	
	public void exibirAlunos () {
		if (estaVazia()) {
			System.out.println("A pilha está vazia");
			return;
		}
		
		AlunoPE aux = topo;
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Aluno: "+aux.getNome());
			aux = aux.proximo;
		}
	}
}