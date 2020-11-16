package com.company;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto (1, "Livro", 1);
        Produto p2 = new Produto (2, "Comida", 2);
        Produto p3 = new Produto (3, "Caderno", 3);
        Produto p4 = new Produto (4, "Agenda", 4);

        CarrinhoDeCompras carrinhoDeCompras = CarrinhoDeCompras.getInstance();
        carrinhoDeCompras.adicionaProduto(p1, 2);
        carrinhoDeCompras.adicionaProduto(p2, 1);
        carrinhoDeCompras.adicionaProduto(p3, 4);
        carrinhoDeCompras.adicionaProduto(p4, 6);

        System.out.println("Listando as informações de carrinho");
        carrinhoDeCompras.listaProdutos();

        carrinhoDeCompras.adicionaProduto(p4, 6);
        System.out.println("Listando as informações do carrinho depois de adicionar outras quantidades no produto (P4)");
        carrinhoDeCompras.listaProdutos();

        carrinhoDeCompras.deletarProduto(p1);
        System.out.println("Listando as informações do carrinho de compra, depois de remover o produto (P1)");
        carrinhoDeCompras.listaProdutos();
    }
}
