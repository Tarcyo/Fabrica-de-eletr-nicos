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
public interface IntRelogioEletronico {

    default double geraCodigoIndentificador() {

        String numeros = "0123456789";
        Random r = new Random();

        String codigoIdentificador = "";
        for (int i = 0; i < 10; i++)
        {
            int a = r.nextInt(10);
            codigoIdentificador = codigoIdentificador + numeros.toCharArray()[a];
            if (i == 5)
            {
                codigoIdentificador = codigoIdentificador + ".";
            }
        }
        return Double.parseDouble(codigoIdentificador);
    }

    public void liga();

    public void desliga();

    public void contaPassos();

    public void marcaBatimentosCardiacos();

    public void marcaQuiilometrosAndados();

    public void enviaMensagem();

    public void recebeMensagem();
    
    public void testa();

}
