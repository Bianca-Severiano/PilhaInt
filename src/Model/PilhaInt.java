package Model;

public class PilhaInt {

	No topo;
	
	public PilhaInt() {
		topo = null;
	}
	
	public void push(int valor) { // Adiciona valor a pilha
		No elemento = new No(); // Cria um novo elemento para a pilha
		elemento.dado = valor; // Atribui valor recebido como parametro ao novo elemento da pilha
		elemento.proximo = topo; // Atribui o topo atual como o próximo do elemento novo "Joga topo para baixo"
		topo = elemento; // Transforma novo elemento como topo da pilha
	}
	
	public boolean isEmpty() { // Metodo verifica se topo está vazio (Confirma se pilha já foi iniciada)
		if (topo == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int pop() throws Exception { // Remove valor da pilha de forma destrutiva
		if (isEmpty()) { // Caso pilha esteja vazia retorna mensagem de erro
			throw new Exception("Pilha Vazia");
		} // Caso pilha não esteja vazia...
		int valor = topo.dado; // Variavel valor recebe informação do valor do topo atual
		topo = topo.proximo; // Topo atual tem dados sobrescritos pelos dados do próximo "Joga próximo para o topo"
		return valor;
	}
	
	
	public int top() throws Exception { // Mostra valor do topo de forma não destrutiva
		if (isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		int valor = topo.dado; // Variavel valor recebe informação do valor do topo atual
		return valor;
	}
	
	public int size() { // Retorna o tamanho da pilha
		int cont = 0;
		if (!isEmpty()) { // Caso pilha não seja nula (esteja vazia)
			No aux = topo; 
			while (aux != null) { // Caso topo seja nulo não deve ser contada, pois indica que não há mais pilha a ser contada
				cont++; // Incrementa-se um ao contador a cada volta
				aux = aux.proximo; // Próximo valor passa a ser considerado com o topo para a contagem
			}
		}
		return cont;
	}

}
