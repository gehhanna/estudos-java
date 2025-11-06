package br.com.george.estudos.filas;

import java.util.ArrayList;
import java.util.List;

public class Queue <T> {

    /** Lista que armazena os elementos da lista */
    private final List<T> elements = new ArrayList<>();

    /** Adiciona um elemento ao final da fila
     *
     * @param element elemento a ser adicionado
     */
    public void enqueue(T element) {
        elements.add(element);
    }

    /**
     * Remove e retorna o elemento na frente da fila (o mais antigo).
     *
     * @return o elemento removido da frente da fila
     * @throws IllegalStateException se a fila estiver vazia
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }
        return elements.remove(0);
    }

    /**
     * Retorna o elemento que está na frente da fila sem removê-lo.
     *
     * @return o primeiro elemento da fila
     * @throws IllegalStateException se a fila estiver vazia
     */
    public T peek() {
        if(isEmpty()) {
            throw new IllegalStateException("A fila esta vazia!");
        }
        return elements.get(0);
    }

    /**
     * Verifica se a fila está vazia.
     *
     * @return {@code true} se a fila estiver vazia; {@code false} caso contrário
     */
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Retorna o número de elementos atualmente na fila.
     *
     * @return a quantidade de elementos na fila
     */
    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return String.format("Queue{size=%d, front=%s, elements=%s}",
                size(),
                isEmpty() ? "null" : peek(),
                elements);
    }

}
