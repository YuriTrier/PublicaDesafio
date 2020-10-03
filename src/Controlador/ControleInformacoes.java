/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import Modelo.Jogador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Yuri
 */

/*
    ControleInformacoes serve para controlarmos as informações que recebemos, realizarmos as operações necessárias e compararmos os novos valores com o que já possuímos nas variáveis. Para tal,
    foi criado um ArrayList com as informações de Jogador, para popularmos o arquivo onde ficam salvas as informações.

*/
public class ControleInformacoes {
    
    public ArrayList<Jogador> jogos;
    private int pontuacaoMaxima;
    private int pontuacaoMinima;
    private int qtdQuebrouMax;
    private int qtdQuebrouMin;
    private int idUltimoJogo;
    
public ControleInformacoes(){ 
    jogos = new ArrayList<Jogador>();
    pontuacaoMaxima = 0;
    pontuacaoMinima = 99999;
    qtdQuebrouMax = 0;
    qtdQuebrouMin = 0;
    idUltimoJogo =0;
    
}   

/*
    O método novoJogo é onde comparamos as variáveis, verificando se o novo valor informado se enquadra em cada uma das regras.
*/

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
    jogo.setJogo(++idUltimoJogo);
    }
 
/*
    gravaInformacoes é o responsável por salvar no arquivo de maneira configurada as informações. O diretório do arquivo está salvo na variável caminho, que foi iniciada em outra classe.
*/ 


    public void gravaInformacoes(String caminho) throws IOException{
        FileWriter writer = new FileWriter(caminho);
        
        BufferedWriter salvar = new BufferedWriter(writer);
        for (Jogador jogo : jogos) {
            salvar.write(jogo.getJogo()+";"+jogo.getPlacar()+";"+jogo.getQtdRecordeMax()+";"+jogo.getQtdRecordeMin()+";"+jogo.getPontuacaoMaxima()+";"+jogo.getPontuacaoMinima()+";");
            salvar.newLine();
        }
        salvar.close(); 
    }
/*
    carregarArquivo busca as informações que foram salvas no arquivo definido pelo diretório setado na variável caminho. Com isto, setamos as informações em Jogo para definirmos na tabela, 
    posteriormente. Este Buffer carrega o que possui no arquivo, sendo necessário configurá-lo conforme o jeito que estamos salvando o arquivo.
    */
    
    
    public void carregarArquivo(String caminho) throws FileNotFoundException, IOException{
    BufferedReader carregar = new BufferedReader(new FileReader(caminho));
        
    String linha = carregar.readLine();
        
    while (linha instanceof String){
        String [] valores = linha.split(";");
        Jogador jogo = new Jogador("Maria", 0, 0, 0, 0);
        jogo.setPlacar(Integer.parseInt(valores[1]));
        novoJogo(jogo);
        linha = carregar.readLine();
        }
        carregar.close();
    }
    public Jogador retornarUltimoJogo(){
        if (!jogos.isEmpty()){
            return jogos.get(jogos.size()-1);
        }
        return null;
    }
}

