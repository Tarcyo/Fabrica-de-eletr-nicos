/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

/**
 *
 * @author Tarcyo
 */
public class NotebookDaApple extends Notebook {

    public NotebookDaApple(String modelo, boolean touchScreen, double memoriaRam, double armazenamento, String processador, double polegadas, String placaDeVídeo, boolean entradaRj45) {
        super(modelo, Marca.APPLE, touchScreen, memoriaRam, armazenamento, processador, polegadas, SistemaOperacional.MACOS, placaDeVídeo, entradaRj45);
    }

    @Override
    public void liga() {
        System.out.println("Você ligou seu notebook da APPLE");
    }

    @Override
    public void desliga() {
        System.out.println("Você desligou seu notebook da APPLE");
    }

    @Override
    public void acendeLuzTeclado() {
        System.out.println("VocÊ acendeu a luz do teclado do seu notebook da apple!");
    }

    @Override
    public void abreTampa() {
        System.out.println("Você abriu seu notebook da APPLE");
    }

    @Override
    public void fechaTampa() {
        System.out.println("Você fechou seu notebook da APPLE");
    }

    @Override
    public void acessaAInternet() {
        System.out.println("Você acessou a internet usando seu notebook da APPLE");
    }
}
