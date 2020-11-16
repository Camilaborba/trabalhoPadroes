package com.company;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    public static CarrinhoDeCompras instanciaCarrinhoDeCompras = null;
    public Map<Produto, Integer> listaDeProdutos = new HashMap<>();

    private CarrinhoDeCompras() {

    }
    public static CarrinhoDeCompras getInstance(){
        if(instanciaCarrinhoDeCompras == null){
            instanciaCarrinhoDeCompras = new CarrinhoDeCompras();
        }
        return instanciaCarrinhoDeCompras;
    }

    public void adicionaProduto(Produto produto, Integer quantidadeProduto){
        // verifica se o produto jÃ¡ foi adicionado na lista, se ele jÃ¡ existe ele na lista, ele irÃ¡ atribuir ele um a quantidade do produto
        Integer quantidadeAtual =0;
        if(listaDeProdutos.containsKey(produto)){
            quantidadeAtual = listaDeProdutos.get(produto);
        }
        Integer quantidadeAtualizada = 0;
        quantidadeAtualizada = quantidadeAtual + quantidadeProduto;
        listaDeProdutos.put(produto, quantidadeAtualizada);
    }

    public void deletarProduto(Produto produto){
        listaDeProdutos.remove(produto);
    }

    public void listaProdutos(){
        listaDeProdutos.entrySet().forEach(cont -> { System.out.println( cont.getKey() + "-"  + cont.getValue());});
    }
}
