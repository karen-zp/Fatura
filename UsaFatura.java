public class UsaFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("001", "Mouse", 2, 35);

        System.out.println("Número da Fatura: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: $" + fatura.getPreco());
        System.out.println("Total da Fatura: $" + fatura.getValorTotal());
    }
}