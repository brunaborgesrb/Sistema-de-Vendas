public class Main {
    public static void main(String[] args) {
        ModoVenda modoVenda = new VendaLojaFisica();  // ou VendaOnline
        NotificacaoVenda notificacaoVenda = new NotificacaoEmail();

        RegistroVenda registroVenda = new RegistroVenda(modoVenda, notificacaoVenda);

        // exemplo de uso
        registroVenda.registrarVenda("Produto A", "Cliente X", 2);
    }
}
