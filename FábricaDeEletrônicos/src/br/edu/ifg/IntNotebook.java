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
public interface IntNotebook {

    default String geraNumeroDeSerie() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVHXYZ";
        String numeroDeSerie = "";
        Random r = new Random();
        for (int i = 0; i < 3; i++)
        {
            int a = r.nextInt(26);
            numeroDeSerie = numeroDeSerie + letras.toCharArray()[a];

        }
        for (int i = 0; i < 10; i++)
        {
            int a = r.nextInt(9);
            numeroDeSerie = numeroDeSerie + a;
        }
        return numeroDeSerie;
    }
    public void liga();
    public void desliga();
    public void acendeLuzTeclado();
    public void abreTampa();
    public void fechaTampa();
    public void acessaAInternet();
    public void testa();
    
    
    
}
