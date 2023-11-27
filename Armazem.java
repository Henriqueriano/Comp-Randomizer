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