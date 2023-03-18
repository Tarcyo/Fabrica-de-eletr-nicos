/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

import java.util.Random;

/**
 *
 * @author Tarcyo
 */
public class RelogioDaSamsung extends RelogioEletronico {

    public RelogioDaSamsung(double tamanhoDeTela, double quantBateria, String modelo, String pulseira, TipoCargaRelogio tipoCargaRelogio) {
        super(tamanhoDeTela, quantBateria, Marca.SAMSUNG, modelo, pulseira, tipoCargaRelogio, SistemaOperacional.TIZON_OS);
    }

    @Override
    public void liga() {
        System.out.println("Você ligou seu relógio da Samsung!");
    }

    @Override
    public void desliga() {
        System.out.println("Você desligou seu relógio da Samsung!");
    }

    @Override
    public void contaPassos() {
        Random r = new Random();
        System.out.println("O seu relógio da Samsung contou que você deu " + r.nextInt(99999999) + " passos");

    }

    @Override
    public void marcaBatimentosCardiacos() {
        Random r = new Random();
        System.out.println("O seu relógio  da Samsung marcou " + r.nextInt(70) + " batimentos cardiacos");

    }

    @Override
    public void marcaQuiilometrosAndados() {
        Random r = new Random();
        System.out.println("O seu relógio da Samsung marcou " + r.nextInt(9999) + " quilometros andados");
    }

    @Override
    public void enviaMensagem() {

        System.out.println("Você enviou uma mensagem usando seu relógio da samsung");
    }

    @Override
    public void recebeMensagem() {
        System.out.println("Você recebeu uma mensagem usando seu relógio da samsung");
    }
}
