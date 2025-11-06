package com.colecoes.pilhas;

public class testStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Teste de Pilha");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Conteúdo: " + stack);
        System.out.println("Topo: " + stack.peek());
        System.out.println("Tamanho: " + stack.size());

        stack.pop();
        System.out.println("Após pop: " + stack);

    }
}
