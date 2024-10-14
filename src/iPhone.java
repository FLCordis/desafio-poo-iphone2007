import Apps.Navegador;
import Apps.ReprodutorMusical;
import Apps.Telefone;

public class iPhone implements ReprodutorMusical, Telefone, Navegador{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página da URL: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma aba a página.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo o correio eletrônico de voz...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música selecionada.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música que está reproduzindo.");
    }

    @Override
    public void selecionarMusica(String url) {
        System.out.println("Adicionando a música selecionada na URL: " + url);
    }
    
}
