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
abstract public class FabricaGenerica {

    private String idFabrica;
    private String endereco;
    private int metaProducao;
    private DepositoDaFabrica deposito;

    @Override
    public String toString() {
        return "FabricaGenerica{" + "idFabrica=" + idFabrica + ", endereco=" + endereco + ", metaProducao=" + metaProducao + ", deposito=" + deposito + '}';
    }

    public FabricaGenerica( String endereco, int metaProducao,int capacidadeDeposito) {
        Random r=new Random();
        
        this.idFabrica =r.nextInt(999999)+"";
        this.endereco = endereco;
        this.metaProducao = metaProducao;
        this.deposito = new DepositoDaFabrica(capacidadeDeposito);
    }

    public String getIdFabrica() {
        return idFabrica;
    }

    public void setIdFabrica(String idFabrica) {
        this.idFabrica = idFabrica;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getMetaProducao() {
        return metaProducao;
    }

    public void setMetaProducao(int metaProducao) {
        this.metaProducao = metaProducao;
    }

    public DepositoDaFabrica getDeposito() {
        return deposito;
    }

    public void setDeposito(DepositoDaFabrica deposito) {
        this.deposito = deposito;
    }

}
