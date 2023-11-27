// Created by Daniel Henrique
// File with the champion copied from https://ge.globo.com/esports/lol/noticia/2022/02/18/campeoes-do-lol-lista-completa-de-personagens-e-funcoes.ghtml 
// The file is edit
import java.io.File;
import java.util.ArrayList;
abstract class Armazem
{
    // Atributos
    protected File arquivo = new File("campeoes.txt");
    protected String campeao;
    protected ArrayList<String> data = new ArrayList<>();
    protected ArrayList<String> player = new ArrayList<>(); 
}
