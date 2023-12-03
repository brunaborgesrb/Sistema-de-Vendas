public class VendaLojaFisica implements ModoVenda {
   
    public void efetuarVenda(String produto, String cliente, int quantidade) {
        // Implementação para venda em loja física
        System.out.println("Venda em loja física:");
        System.out.println("Produto: " + produto);
        System.out.println("Cliente: " + cliente);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Venda efetuada em loja física.");
    }

    
    public double calcularDesconto() {
        // Implementação do cálculo de desconto para venda em loja física
        double precoTotal = 100.0; // valor da venda
        double desconto = precoTotal * 0.05; // 5% de desconto
        return desconto;
    }
}