package org.example;

import org.example.Controller.EstoquePecasController;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstoquePecasController c = new EstoquePecasController(scanner);
        c.iniciar();
    }
}