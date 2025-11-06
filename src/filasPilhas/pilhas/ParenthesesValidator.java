package com.colecoes.pilhas;

public class ParenthesesValidator {

    /**
     * Verifica se a string de parênteses, colchetes e chaves está balanceada.
     *
     * @param s A string a ser verificada
     * @return true se a string estiver balanceada, false caso contrário
     */
    public static boolean isBalanced(String s) {
        // Cria uma pilha de caracteres para armazenar os símbolos de abertura
        Stack<Character> stack = new Stack<>();

        /* Converte a string em array de caracteres.
         * Itera caractere por caractere, da esquerda para a direita. */
        for (char c : s.toCharArray()) {

            /* Detectando símbolos de abertura: (, [, {
             * Se o caractere for um destes, empilha na pilha */
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);

                /* Detectando símbolos de fechamento: ), ], }
                 * Se o caractere for um destes, precisamos:
                 * 1. Verificar se existe uma abertura correspondente na pilha
                 * 2. Desempilhar o topo da pilha (último símbolo aberto)
                 * 3. Verificar se o topo e o fechamento atual correspondem */
            } else if (c == ')' || c == ']' || c == '}') {
                // Se a pilha estiver vazia, não há abertura correspondente
                if (stack.isEmpty()) return false;

                // Remove o último símbolo de abertura (topo da pilha)
                char top = stack.pop();

                // Verifica se o símbolo desempilhado combina com o fechamento atual
                // Se não combinar, a string não está balanceada
                if (!matches(top, c)) return false;
            }
        }

        /* No final da iteração, se a pilha estiver vazia, todos os pares foram fechados corretamente.
         * Se a pilha ainda tiver elementos, sobrou alguma abertura sem fechamento. */
        return stack.isEmpty();
    }

    /**
     * Verifica se um par de abertura e fechamento corresponde
     *
     * @param open  Caractere de abertura: '(', '[', '{'
     * @param close Caractere de fechamento: ')', ']', '}'
     * @return true se o par corresponder, false caso contrário
     */
    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
