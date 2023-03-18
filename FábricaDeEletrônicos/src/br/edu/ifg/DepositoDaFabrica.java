/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Tarcyo
 */
public class DepositoDaFabrica implements IntDeposito {

    public DepositoDaFabrica(int capacidade) {
        Random r = new Random();
        this.idDeposito = r.nextInt(9999999);
        this.capacidade = capacidade;
        this.celularesDepositados = new ArrayList<Celular>();
        this.relogioDepositados = relogioDepositados=new ArrayList<RelogioEletronico>();
        this.notebooksDepositados = notebooksDepositados=new ArrayList<Notebook>();
    }

    private int idDeposito;
    private int capacidade;
    private ArrayList<Celular> celularesDepositados;
    private ArrayList<RelogioEletronico> relogioDepositados;
    private ArrayList<Notebook> notebooksDepositados;

    public int getIdDeposito() {
        return idDeposito;
    }

    public void setIdDeposito(int idDeposito) {
        this.idDeposito = idDeposito;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public ArrayList<Celular> getCelularesDepositados() {
        return celularesDepositados;
    }

    public void setCelularesDepositados(ArrayList<Celular> celularesDepositados) {
        this.celularesDepositados = celularesDepositados;
    }

    public ArrayList<RelogioEletronico> getRelogioDepositados() {
        return relogioDepositados;
    }

    public void setRelogioDepositados(ArrayList<RelogioEletronico> relogioDepositados) {
        this.relogioDepositados = relogioDepositados;
    }

    public ArrayList<Notebook> getNotebooksDepositados() {
        return notebooksDepositados;
    }

    public void setNotebooksDepositados(ArrayList<Notebook> notebooksDepositados) {
        this.notebooksDepositados = notebooksDepositados;
    }

    @Override
    public boolean verificaCapacidade() {
        if ((this.getCelularesDepositados().size() + this.getNotebooksDepositados().size() + this.getRelogioDepositados().size()) < this.getCapacidade())
        {
            return true;
        }
        return false;

    }

    @Override
    public String enviaParaOFornecedor() {
        String mensagem = "OS SEGUINTES PRODUTOS FORAM ENVIADOS PARA O FORNECEDOR: \n" + this.supervisionaEstoque();
        this.esvaziaODeposito();
        return mensagem;

    }

    @Override
    public void esvaziaODeposito() {
        this.notebooksDepositados = new ArrayList<Notebook>();
        this.celularesDepositados = new ArrayList<Celular>();
        this.relogioDepositados = new ArrayList<RelogioEletronico>();

    }

    @Override
    public boolean adicionaProduto(Notebook notebook) {
        if (this.verificaCapacidade())
        {
            this.getNotebooksDepositados().add(notebook);
            return true;
        }
        return false;

    }

    @Override
    public boolean adicionaProduto(Celular celular) {
        if (this.verificaCapacidade())
        {
            this.getCelularesDepositados().add(celular);
            return true;
        }

        return false;
    }

    @Override
    public boolean adicionaProduto(RelogioEletronico relogio) {
        if (this.verificaCapacidade())
        {
         this.getRelogioDepositados().add(relogio);
         return true;
        }
        
        return false;

    }

    @Override
    public String supervisionaEstoque() {

        String mensagem = "\nCelulares: \n";
        int i = 1;

        for (Celular celular : this.getCelularesDepositados())
        {
            mensagem = mensagem + " " + i + "° celular:" + celular + "\n";
            i++;

        }
        i = 1;
        mensagem = mensagem+"\nNotebooks: \n";

        for (Notebook notebook : this.getNotebooksDepositados())
        {
            mensagem = mensagem + " " + i + "° notebook:" + notebook + "\n";
            i++;

        }

        i = 1;
        mensagem = mensagem+ "\nRelógios: \n";

        for (RelogioEletronico relogio : this.getRelogioDepositados())
        {
            mensagem = mensagem + " " + i + "° relógio:" + relogio + "\n";
             i++;

        }
        return mensagem;

    }

}
