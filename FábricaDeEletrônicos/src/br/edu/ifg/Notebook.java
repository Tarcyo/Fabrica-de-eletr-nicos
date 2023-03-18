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
abstract public class Notebook implements IntNotebook {

    @Override
    public String toString() {
        return "Notebook{" + "marca=" + marca + " numeroDeS\u00e9rie=" + numeroDeSérie + ", modelo=" + modelo + ", touchScreen=" + touchScreen + ", memoriaRam=" + memoriaRam + ", armazenamento=" + armazenamento + ", processador=" + processador + ", polegadas=" + polegadas + ", SO=" + SO + ", placaDeV\u00eddeo=" + placaDeVídeo + ", entradaRj45=" + entradaRj45 + '}';
    }

    private String numeroDeSérie;
    private String modelo;
    private Marca marca;
    private boolean touchScreen;
    private double memoriaRam;
    private double armazenamento;
    private String processador;
    private double polegadas;
    private SistemaOperacional SO;
    private String placaDeVídeo;
    private boolean entradaRj45;

    public Notebook(String modelo, Marca marca, boolean touchScreen, double memoriaRam, double armazenamento, String processador, double polegadas, SistemaOperacional SO, String placaDeVídeo, boolean entradaRj45) {
        this.numeroDeSérie = this.geraNumeroDeSerie();
        this.modelo = modelo;
        this.marca = marca;
        this.touchScreen = touchScreen;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.processador = processador;
        this.polegadas = polegadas;
        this.SO = SO;
        this.placaDeVídeo = placaDeVídeo;
        this.entradaRj45 = entradaRj45;
    }

    public String getNumeroDeSérie() {
        return numeroDeSérie;
    }

    public void setNumeroDeSérie(String numeroDeSérie) {
        this.numeroDeSérie = numeroDeSérie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public double getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(double polegadas) {
        this.polegadas = polegadas;
    }

    public SistemaOperacional getSO() {
        return SO;
    }

    public void setSO(SistemaOperacional SO) {
        this.SO = SO;
    }

    public String getPlacaDeVídeo() {
        return placaDeVídeo;
    }

    public void setPlacaDeVídeo(String placaDeVídeo) {
        this.placaDeVídeo = placaDeVídeo;
    }

    public boolean isEntradaRj45() {
        return entradaRj45;
    }

    public void setEntradaRj45(boolean entradaRj45) {
        this.entradaRj45 = entradaRj45;
    }

    @Override
    public void liga() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void desliga() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void acendeLuzTeclado() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void abreTampa() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void fechaTampa() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void acessaAInternet() {
        //Será sobrescrito na especificação da marca
    }

    @Override
    public void testa() {
        liga();
        abreTampa();

        acendeLuzTeclado();

        acessaAInternet();
        fechaTampa();
        desliga();
        System.out.print("\n");
    }

}
