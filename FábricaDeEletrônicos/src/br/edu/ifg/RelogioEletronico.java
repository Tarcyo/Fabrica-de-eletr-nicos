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
abstract public class RelogioEletronico implements IntRelogioEletronico {

    private double codigoIdentificador;
    private double tamanhoDeTela;
    private double quantBateria;
    private Marca marca;
    private String modelo;
    private String pulseira;
    private TipoCargaRelogio tipoCargaRelogio;
    private SistemaOperacional SO;

    @Override
    public String toString() {
        return "RelogioEletronico{" + "marca=" + marca+ " codigoIdentificador=" + codigoIdentificador + ", tamanhoDeTela=" + tamanhoDeTela + ", quantBateria=" + quantBateria  + ", modelo=" + modelo + ", pulseira=" + pulseira + ", tipoCargaRelogio=" + tipoCargaRelogio + ", SO=" + SO + '}';
    }

    public RelogioEletronico(double tamanhoDeTela, double quantBateria, Marca marca, String modelo, String pulseira, TipoCargaRelogio tipoCargaRelogio, SistemaOperacional SO) {
        this.codigoIdentificador = this.geraCodigoIndentificador();
        this.tamanhoDeTela = tamanhoDeTela;
        this.quantBateria = quantBateria;
        this.marca = marca;
        this.modelo = modelo;
        this.pulseira = pulseira;
        this.tipoCargaRelogio = tipoCargaRelogio;
        this.SO = SO;
    }

    public double getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(double codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public double getTamanhoDeTela() {
        return tamanhoDeTela;
    }

    public void setTamanhoDeTela(double tamanhoDeTela) {
        this.tamanhoDeTela = tamanhoDeTela;
    }

    public double getQuantBateria() {
        return quantBateria;
    }

    public void setQuantBateria(double quantBateria) {
        this.quantBateria = quantBateria;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPulseira() {
        return pulseira;
    }

    public void setPulseira(String pulseira) {
        this.pulseira = pulseira;
    }

    public TipoCargaRelogio getTipoCargaRelogio() {
        return tipoCargaRelogio;
    }

    public void setTipoCargaRelogio(TipoCargaRelogio tipoCargaRelogio) {
        this.tipoCargaRelogio = tipoCargaRelogio;
    }

    public SistemaOperacional getSO() {
        return SO;
    }

    public void setSO(SistemaOperacional SO) {
        this.SO = SO;
    }

    @Override
    public void liga() {

    }

    @Override
    public void desliga() {
        //Será sobrescrito na especificação da linguagem
    }

    @Override
    public void contaPassos() {
        //Será sobrescrito na especificação da linguagem

    }

    @Override
    public void marcaBatimentosCardiacos() {
        //Será sobrescrito na especificação da linguagem

    }

    @Override
    public void marcaQuiilometrosAndados() {
        //Será sobrescrito na especificação da linguagem
    }

    @Override
    public void enviaMensagem() {
        //Será sobrescrito na especificação da linguagem
    }

    @Override
    public void recebeMensagem() {
        //Será sobrescrito na especificação da linguagem
    }

    @Override
    public void testa() {
        liga();

        contaPassos();

        marcaBatimentosCardiacos();

        marcaQuiilometrosAndados();

        enviaMensagem();

        recebeMensagem();

        desliga();
        System.out.print("\n");
    }

}
