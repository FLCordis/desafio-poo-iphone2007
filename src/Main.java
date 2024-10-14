public class Main {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        meuiPhone.ligar("16997826465");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        meuiPhone.selecionarMusica("Fortress - Alter Bridge");
        meuiPhone.tocar();
        meuiPhone.pausar();

        meuiPhone.exibirPagina("https://www.google.com.br");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}
