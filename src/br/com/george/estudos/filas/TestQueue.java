package br.com.george.estudos.filas;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        System.out.println("Fila inicial: " + queue);
        System.out.println("Frente: " + queue.peek());
        System.out.println("Tamanho: " + queue.size());

        queue.dequeue();
        System.out.println("Após dequeue: " + queue);
    }
}
