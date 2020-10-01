/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Yuri
 */
public class Jogador {
    private String name;
    private int pontuacaoMaxima;
    private int pontuacaoMinima;
    private int qtdRecordeMin;
    private int qtdRecordeMax;
    private int jogo;
    private int placar;

    public Jogador(String name, int pontuacaoMaxima, int pontuacaoMinima, int qtdRecordeMin, int qtdRecordeMax) {
        this.setName(name);
        this.setPontuacaoMinima(0);
        this.setPontuacaoMaxima(0);
        this.setQtdRecordeMin(0);
        this.setQtdRecordeMax(0);
        this.setJogo(1);
        this.setPlacar(placar);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPontuacaoMaxima() {
        return pontuacaoMaxima;
    }

    public void setPontuacaoMaxima(int pontuacaoMaxima) {
        this.pontuacaoMaxima = pontuacaoMaxima;
    }

    public int getPontuacaoMinima() {
        return pontuacaoMinima;
    }

    public void setPontuacaoMinima(int pontuacaoMinima) {
        this.pontuacaoMinima = pontuacaoMinima;
    }

    public int getQtdRecordeMin() {
        return qtdRecordeMin;
    }

    public void setQtdRecordeMin(int qtdRecordeMin) {
        this.qtdRecordeMin = qtdRecordeMin;
    }

    public int getQtdRecordeMax() {
        return qtdRecordeMax;
    }

    public void setQtdRecordeMax(int qtdRecordeMax) {
        this.qtdRecordeMax = qtdRecordeMax;
    }

    public int getPlacar() {
        return placar;
    }

    public void setPlacar(int placar) {
        this.placar = placar;
    }

    public int getJogo() {
        return jogo;
    }

    public void setJogo(int jogo) {
        this.jogo = jogo;
    }

        
    
}