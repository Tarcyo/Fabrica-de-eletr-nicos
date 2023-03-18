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
public enum SistemaOperacional{

    ANDROID("ANDROID"),
    IOS("IOS"),
    WINDOWSPHONE("WINDOWSPHONE"),
    WINDOWS("WINDOWS"),
    LINUX("LINUX"),
    MACOS("MACOS"),
    TIZON_OS("TIZON_OS"),
    WATCHOS("WATCHOS");

    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }
    private String descricao;

   SistemaOperacional(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
