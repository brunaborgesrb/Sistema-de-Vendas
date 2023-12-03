public class NotificacaoEmail implements NotificacaoVenda {
    
    public void enviarConfirmacao(String produto, String cliente, int quantidade) {
        // Implementação do envio de confirmação por e-mail
        System.out.println("Enviando confirmação por e-mail:");
        System.out.println("Produto: " + produto);
        System.out.println("Cliente: " + cliente);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Confirmação enviada por e-mail.");
    }

    
    public void enviarRecibo() {
        // Implementação do envio de recibo por e-mail
        System.out.println("Enviando recibo por e-mail:");
        System.out.println("Recibo enviado por e-mail.");
    }
}