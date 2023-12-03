public class VendaOnline implements ModoVenda {
    
    public void efetuarVenda(String produto, String cliente, int quantidade) {
        // Implementação para venda online
        System.out.println("Venda online:");
        System.out.println("Produto: " + produto);
        System.out.println("Cliente: " + cliente);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Venda efetuada online.");
    }

    public double calcularDesconto() {
        // Implementação do cálculo de desconto para venda online
        double precoTotal = 100.0; // valor da venda
        double desconto = precoTotal * 0.03; // 3% de desconto
        return desconto;
    }
}