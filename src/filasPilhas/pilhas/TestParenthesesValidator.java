package com.colecoes.pilhas;

public class TestParenthesesValidator {
    public static void main(String[] args) {

        String[] tests = {"{[()]}", "{[(])}", "((()))", "([{}])", "{[}"};

        for (String test : tests) {
            System.out.printf("%s -> %b%n", test, ParenthesesValidator.isBalanced(test));
        }

    }
}
