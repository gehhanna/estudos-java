package br.com.george.estudos.pilhas;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementação genérica de uma estrutura de dados do tipo Pilha (Stack),
 * que segue o princípio LIFO (Last In, First Out).
 * <p>
 * O último elemento inserido é o primeiro a ser removido.
 *
 * @param <T> o tipo dos elementos armazenados na pilha
 */
public class Stack<T> {

    /** Lista interna que armazena os elementos da pilha. */
    private final List<T> elements = new ArrayList<>();

    /**
     * Insere um novo elemento no topo da pilha.
     *
     * @param element o elemento a ser adicionado
     */
    public void push(T element) {
        elements.add(element);
    }

    /**
     * Remove e retorna o elemento do topo da pilha.
     *
     * @return o elemento removido do topo da pilha
     * @throws IllegalStateException se a pilha estiver vazia
     */
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia");
        }
        return elements.remove(elements.size() - 1);
    }

    /**
     * Retorna o elemento do topo da pilha sem removê-lo.
     *
     * @return o elemento do topo da pilha
     * @throws IllegalStateException se a pilha estiver vazia
     */
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia");
        }
        return elements.get(elements.size() - 1);
    }

    /**
     * Verifica se a pilha está vazia.
     *
     * @return {@code true} se a pilha estiver vazia; {@code false} caso contrário
     */
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Retorna o número de elementos atualmente na pilha.
     *
     * @return a quantidade de elementos na pilha
     */
    public int size() {
        return elements.size();
    }

    /**
     * Retorna uma representação textual da pilha, mostrando o tamanho,
     * o topo e os elementos armazenados.
     *
     * @return uma string representando o estado atual da pilha
     */
    @Override
    public String toString() {
        return String.format("Stack{size=%d, top=%s, elements=%s}",
                size(),
                isEmpty() ? "null" : peek(),
                elements);
    }
}


