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
public interface FabricaDeEletronicosGenerica {

    public Celular criaCelular(String modelo, float tamanhoDeTela, String resolucaoDeTela, float capacidadeArmazenamento, float ram, float resolucaoCamera, float capacidadeBateria);

    public Notebook criaNotebook(String modelo, boolean touchScreen, double memoriaRam, double armazenamento, String processador, double polegadas, String placaDeVídeo, boolean entradaRj45);

    public RelogioEletronico criaRelogio(double tamanhoDeTela, double quantBateria, String modelo, String pulseira, TipoCargaRelogio tipoCargaRelogio);
    
    public ArrayList<Celular> criaLoteCelular(String modelo, float tamanhoDeTela, String resolucaoDeTela, float capacidadeArmazenamento, float ram, float resolucaoCamera, float capacidadeBateria);

    public ArrayList<Notebook> criaLoteNotebook(String modelo, boolean touchScreen, double memoriaRam, double armazenamento, String processador, double polegadas, String placaDeVídeo, boolean entradaRj45);

    public ArrayList<RelogioEletronico> criaLoteRelogio(double tamanhoDeTela, double quantBateria, String modelo, String pulseira, TipoCargaRelogio tipoCargaRelogio);
    
    public DepositoDaFabrica mostraEstoque();

}
