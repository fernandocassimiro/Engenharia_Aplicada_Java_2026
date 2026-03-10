class ItemCardapio {
    // 1. ATRIBUTOS (O que estava faltando)
    int id;
    String nome;
    String descrição;
    boolean emPromoção;
    double preço;
    double preçoComDesconto;
    int categoria;

    // 2. CONSTRUTOR
    ItemCardapio(int id, String nome, String descrição, boolean emPromoção, double preço, double preçoComDesconto, int categoria) {
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.emPromoção = emPromoção;
        this.preço = preço;
        this.preçoComDesconto = preçoComDesconto;
        this.categoria = categoria;
    }

    // 3. MÉTODOS
    double calcularPorcentagemDesconto() {
        if (emPromoção && preço > 0) {
            return ((preço - preçoComDesconto) / preço) * 100;
        }
        return 0.0;
    }

    String obtemCategoria() {
        return switch (categoria) {
            case 1 -> "Lanches";
            case 2 -> "Pizzas";
            case 3 -> "Bebidas";
            default -> "Categoria desconhecida";
        };
    }
}

// Classe principal para rodar o programa
class Main {
    void main(String[] args) {
        var item1 = new ItemCardapio(1, "Hambúrguer", "Delicioso hambúrguer artesanal", true, 20.0, 15.0, 1);
        var item2 = new ItemCardapio(2, "Pizza Margherita", "Pizza clássica", false, 30.0, 30.0, 2);
        var item3 = new ItemCardapio(3, "Refrigerante", "Refrigerante gelado", true, 5.0, 3.0, 3);
        var item4 = new ItemCardapio(4, "Coca-Cola", "Refrigerante gelado", false, 5.0, 5.0, 3);    
        var item5 = new ItemCardapio(5, "Pizza Pepperoni", "Pizza com pepperoni", true, 35.0, 28.0, 2);
        var item6 = new ItemCardapio(6, "Suco de Laranja", "Suco natural de laranja", false, 7.0, 7.0, 3);  
        var item7 = new ItemCardapio(7, "X-Bacon", "Hambúrguer com bacon", true, 25.0, 20.0, 1);
       
        ItemCardapio[] cardapio = {item1, item2, item3, item4, item5, item6, item7};

        String linha = IO.readln("Digite um id de um item do cardápio: ");
        long idSelecionado = Long.parseLong(linha);
       
       
        for (ItemCardapio item : cardapio) {
            if (item.id == idSelecionado) {
                System.out.println("Nome: " + item.nome);
                System.out.println("Descrição: " + item.descrição);
                System.out.println("Categoria: " + item.obtemCategoria());
                
            }
        }   


        
    
    }
}