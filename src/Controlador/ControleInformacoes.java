/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import Modelo.Jogador;
/**
 *
 * @author Yuri
 */
public class ControleInformacoes {
    
    private ArrayList<Jogador> jogos;
    private int pontuacaoMaxima;
    private int pontuacaoMinima;
    private int qtdQuebrouMax;
    private int qtdQuebrouMin;
    
public ControleInformacoes(){ 
    jogos = new ArrayList<Jogador>();
    pontuacaoMaxima = 0;
    pontuacaoMinima = 99999;
    qtdQuebrouMax = 0;
    qtdQuebrouMin = 0;
    
}   
    
public void novoJogo(Jogador jogo){
    jogos.add(jogo);
        
    if (jogo.getPlacar() > pontuacaoMaxima){
        pontuacaoMaxima = jogo.getPlacar();
        qtdQuebrouMax++;
    }
    if (jogo.getPlacar() < pontuacaoMinima){
        pontuacaoMinima = jogo.getPlacar();
        qtdQuebrouMin++;
    }
        
    jogo.setPontuacaoMaxima(pontuacaoMaxima);
    jogo.setPontuacaoMinima(pontuacaoMinima);
    jogo.setQtdRecordeMax(qtdQuebrouMax);
    jogo.setQtdRecordeMin(qtdQuebrouMin);
    }
 
    
}

