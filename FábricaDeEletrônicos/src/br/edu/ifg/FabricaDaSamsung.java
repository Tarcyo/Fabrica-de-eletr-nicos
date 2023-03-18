/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

import java.util.ArrayList;

/**
 *
 * @author Tarcyo
 */
public class FabricaDaSamsung extends FabricaGenerica implements FabricaDeEletronicosGenerica {

    public FabricaDaSamsung(String endereco, int metaProducao, int capacidadeDeposito) {
        super(endereco, metaProducao, capacidadeDeposito);
    }

    @Override
    public Celular criaCelular(String modelo, float tamanhoDeTela, String resolucaoDeTela, float capacidadeArmazenamento, float ram, float resolucaoCamera, float capacidadeBateria) {
        Celular celular = new CelularDaSamsung(modelo, tamanhoDeTela, resolucaoDeTela, capacidadeArmazenamento, ram, resolucaoCamera, capacidadeBateria);
        this.getDeposito().adicionaProduto(celular);
        return celular;
    }

    @Override
    public Notebook criaNotebook(String modelo, boolean touchScreen, double memoriaRam, double armazenamento, String processador, double polegadas, String placaDeVídeo, boolean entradaRj45) {
        Notebook notebook = new NotebookDaSamsung(modelo, touchScreen, memoriaRam, armazenamento, processador, polegadas, placaDeVídeo, entradaRj45);
        this.getDeposito().adicionaProduto(notebook);
        return notebook;
    }

    @Override
    public RelogioEletronico criaRelogio(double tamanhoDeTela, double quantBateria, String modelo, String pulseira, TipoCargaRelogio tipoCargaRelogio) {
        RelogioEletronico relogio = new RelogioDaSamsung(tamanhoDeTela, quantBateria, modelo, pulseira, tipoCargaRelogio);
        this.getDeposito().adicionaProduto(relogio);
        return relogio;
    }

    @Override
    public ArrayList<Celular> criaLoteCelular(String modelo, float tamanhoDeTela, String resolucaoDeTela, float capacidadeArmazenamento, float ram, float resolucaoCamera, float capacidadeBateria) {
        ArrayList<Celular> list = new ArrayList<Celular>();
        for (int i = 0; i < this.getMetaProducao(); i++)
        {
            if (this.getDeposito().verificaCapacidade())
            {
                Celular x = this.criaCelular(modelo, tamanhoDeTela, resolucaoDeTela, capacidadeArmazenamento, ram, resolucaoCamera, capacidadeBateria);
                list.add(x);
                
            }
        }
        return list;
    }

    @Override
    public ArrayList<Notebook> criaLoteNotebook(String modelo, boolean touchScreen, double memoriaRam, double armazenamento, String processador, double polegadas, String placaDeVídeo, boolean entradaRj45) {
        ArrayList<Notebook> list = new ArrayList<Notebook>();
        for (int i = 0; i < this.getMetaProducao(); i++)
        {
            if (this.getDeposito().verificaCapacidade())
            {
                Notebook x = this.criaNotebook(modelo, touchScreen, memoriaRam, armazenamento, processador, polegadas, placaDeVídeo, entradaRj45);
                list.add(x);
              
            } 

        }
        return list;
    }

    @Override
    public ArrayList<RelogioEletronico> criaLoteRelogio(double tamanhoDeTela, double quantBateria, String modelo, String pulseira, TipoCargaRelogio tipoCargaRelogio) {
        ArrayList<RelogioEletronico> list = new ArrayList<RelogioEletronico>();
        for (int i = 0; i < this.getMetaProducao(); i++)
        {
            if (this.getDeposito().verificaCapacidade())
            {
                RelogioEletronico x = this.criaRelogio(tamanhoDeTela, quantBateria, modelo, pulseira, tipoCargaRelogio);
                list.add(x);
              
            } 
        }
        return list;
    }
    @Override
    public DepositoDaFabrica mostraEstoque(){
        return this.getDeposito();
    }
}
   
