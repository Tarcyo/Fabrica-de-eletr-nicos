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
public class NotebookDaSamsung extends Notebook {

    public NotebookDaSamsung(String modelo, boolean touchScreen, double memoriaRam, double armazenamento, String processador, double polegadas, String placaDeVídeo, boolean entradaRj45) {
        super(modelo, Marca.SAMSUNG, touchScreen, memoriaRam, armazenamento, processador, polegadas, SistemaOperacional.WINDOWS, placaDeVídeo, entradaRj45);
    }

    @Override
    public void liga() {
        System.out.println("Você ligou seu notebook da samsung");
    }

    @Override
    public void desliga() {
        System.out.println("Você desligou seu notebook da samsung");
    }

    @Override
    public void acendeLuzTeclado() {
        System.out.println("VocÊ acendeu a luz do teclado do seu notebook da samsung!");
    }

    @Override
    public void abreTampa() {
        System.out.println("Você abriu seu notebook da samsung");
    }

    @Override
    public void fechaTampa() {
        System.out.println("Você fechou seu notebook da samsung");
    }

    @Override
    public void acessaAInternet() {
        System.out.println("Você acessou a internet usando seu notebook da samsung");
    }
}
