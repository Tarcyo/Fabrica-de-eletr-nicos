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
public interface IntDeposito {

    public boolean verificaCapacidade();

    public String enviaParaOFornecedor();

    public void esvaziaODeposito();

    public String supervisionaEstoque();

    public boolean adicionaProduto(Notebook n);
    
    public boolean adicionaProduto(RelogioEletronico r);
    
    public boolean adicionaProduto(Celular c);

}
