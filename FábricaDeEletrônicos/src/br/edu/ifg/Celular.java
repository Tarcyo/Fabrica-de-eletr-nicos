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
abstract public class Celular implements IntCelularGenerico {

    @Override
    public String toString() {
        return "Celular{" + " marca=" + marca+ " imei=" + imei  + ", modelo=" + modelo + ", SO=" + SO + ", tamanhoDeTela=" + tamanhoDeTela + ", resolucaoDeTela=" + resolucaoDeTela + ", capacidadeArmazenamento=" + capacidadeArmazenamento + ", ram=" + ram + ", resolucaoCamera=" + resolucaoCamera + ", capacidadeBateria=" + capacidadeBateria + '}';
    }

    private int imei;
    private Marca marca;
    private String modelo;
    private SistemaOperacional SO;
    private float tamanhoDeTela;
    private String resolucaoDeTela;
    private float capacidadeArmazenamento;
    private float ram;
    private float resolucaoCamera;
    private float capacidadeBateria;

    public Celular(Marca marca, String modelo, SistemaOperacional SO, float tamanhoDeTela, String resolucaoDeTela, float capacidadeArmazenamento, float ram, float resolucaoCamera, float capacidadeBateria) {
        this.imei = this.geraIMEI();
        this.marca = marca;
        this.modelo = modelo;
        this.SO = SO;
        this.tamanhoDeTela = tamanhoDeTela;
        this.resolucaoDeTela = resolucaoDeTela;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.ram = ram;
        this.resolucaoCamera = resolucaoCamera;
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public void liga() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void tiraFoto() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void desliga() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void carrega() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void mandaMensagem() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void recebeMensagem() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void fazChamada() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void recebeChamada() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void testa() {

        liga();

        tiraFoto();

        carrega();

        mandaMensagem();

        recebeMensagem();

        fazChamada();

        recebeChamada();
        desliga();
        System.out.print("\n");
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
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

    public SistemaOperacional getSO() {
        return SO;
    }

    public void setSO(SistemaOperacional SO) {
        this.SO = SO;
    }

    public float getTamanhoDeTela() {
        return tamanhoDeTela;
    }

    public void setTamanhoDeTela(float tamanhoDeTela) {
        this.tamanhoDeTela = tamanhoDeTela;
    }

    public String getResolucaoDeTela() {
        return resolucaoDeTela;
    }

    public void setResolucaoDeTela(String resolucaoDeTela) {
        this.resolucaoDeTela = resolucaoDeTela;
    }

    public float getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(float capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }

    public float getResolucaoCamera() {
        return resolucaoCamera;
    }

    public void setResolucaoCamera(float resolucaoCamera) {
        this.resolucaoCamera = resolucaoCamera;
    }

    public float getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(float capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

}
