//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Niveis de encapsulamento: Private, Default, Proteced e Public
        //Private: Na mesma classe
        //Default: Mesma classe se estiver na mesma pasta
        //Proteced: Pode visualizar desde que exista uma herança entre essas classes
        //Public: Visivel em todas as classes e pacote

        Produto produto = new Produto("Notebook", 5000,5);
        System.out.println(produto);

        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidade());



    }
}


