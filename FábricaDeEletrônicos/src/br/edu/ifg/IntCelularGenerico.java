package br.edu.ifg;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tarcyo
 */
public interface IntCelularGenerico {

    default int geraIMEI() {
        String IMEI = "";
        for (int i = 0; i < 9; i++)
        {
            Random r = new Random();
            int a = r.nextInt(9);
            IMEI = IMEI + a;
        }
        return Integer.parseInt(IMEI);
    }

    public void liga();

    public void tiraFoto();

    public void desliga();

    public void carrega();

    public void mandaMensagem();

    public void recebeMensagem();

    public void fazChamada();

    public void recebeChamada();
    
    public void testa();
}
