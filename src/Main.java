public class Main {
    public static void main(String[] args) {
        Produto livro = new Livro("Noites Brancas", 80.00, "Dostoivski", 300, true);
        Produto camisa = new Camisa("Camisa Polo", 99.99, "Amarelo", "P", "Metal");

        System.out.println("--- Informações do Livro ---");
        livro.exibirInfo();

        System.out.println("\n--- Informações da Camisa ---");
        camisa.exibirInfo();
    }
}