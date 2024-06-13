import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {

    private String conteudo;


    public Senha(String conteudo){
        setConteudo(conteudo);
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        if (conteudo.length() < 10 || conteudo.length() > 30) throw new IllegalArgumentException("Tamanho inválido");
        if (!conteudo.matches("[A-Z]+")) throw new IllegalArgumentException("Senha deve conter pelo um caracter maiusculo");
        if (!conteudo.matches("[a-z]+")) throw  new IllegalArgumentException("Senha deve conter pelo menos um caracter minusculo");
        if (!conteudo.matches("[0-9]+")) throw  new IllegalArgumentException("Senha deve conter pelo menos um digito");
        if (!conteudo.matches("[@#&$*!?]+")) throw new IllegalArgumentException("Senha deve conter pelo menos um símbolo");
        this.conteudo = conteudo;
    }

    public Double forca(){
        Double forca = 75.00;
        for (int i = 10; i < getConteudo().length();i++){
            forca += 1.25;
        }
        return forca;

    }
}
