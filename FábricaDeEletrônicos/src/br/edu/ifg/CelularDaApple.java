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
public class CelularDaApple extends Celular {

    public CelularDaApple(String modelo, float tamanhoDeTela, String resolucaoDeTela, float capacidadeArmazenamento, float ram, float resolucaoCamera, float capacidadeBateria) {
        super(Marca.APPLE, modelo, SistemaOperacional.IOS, tamanhoDeTela, resolucaoDeTela, capacidadeArmazenamento, ram, resolucaoCamera, capacidadeBateria);

    }

    @Override
    public void liga() {
        System.out.println("Você ligou seu celular da apple!");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Uma foto foi adicionada a sua galeria do seu celular da apple!");
    }

    @Override
    public void desliga() {
        System.out.println("Você desligou seu celular da apple!");
    }

    @Override
    public void carrega() {
        System.out.println("Você colocou o seu celular da apple para carregar!");
    }

    @Override
    public void mandaMensagem() {
        System.out.println("Você enviou uma mensagem usando seu celular da apple!");
    }

    @Override
    public void recebeMensagem() {
        System.out.println("Você recebeu uma mensagem usando seu celular da apple!");
    }

    @Override
    public void fazChamada() {
        System.out.println("Você fez uma chamada usando seu celular da apple!");
    }

    @Override
    public void recebeChamada() {
        System.out.println("Você recebeu uma chamada usando seu celular da apple!");
    }
}
