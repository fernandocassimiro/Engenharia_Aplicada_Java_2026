class RestauranteFlorindaEats {
	public static void main (String [] args){
		String nome = "Sanduíche de Presunto do Chaves";
		String descricao = "Sanduíche de presunto simples...";
		boolean emPromocao = true;
		double preco = 3.50;
		double precoComDesconto = 2.99;
		long id = 3_000_000_000L;
		int categoria = 3;


		if (categoria == 1) {
 		IO.println("Categoria: Entradas");

		} else if (categoria == 2) {
 	
			IO.println("Categoria: Pratos Principais");
	
		}else if (categoria == 3) {
 
			IO.println("Categoria: Sobremesas");

		} else if (categoria == 4) {
 
			IO.println("Categoria: Bebidas");

		} else {
 
			IO.println("Categoria não encontrada...");
}

// A mesma lógica usando switch-case

switch(categoria) {
 
	case 1:
 
	IO.println("Categoria: Entradas");
 
	break; // Impede o "fall-through" para o próximo case
 
	case 2:
 
	IO.println("Categoria: Pratos Principais");
 
	break;
 
	case 3:
 
	IO.println("Categoria: Sobremesas");
 
	break;
 
	case 4:
 
	IO.println("Categoria: Bebidas");

	break;
 
	default: // Equivalente ao "else"
 
	IO.println("Categoria não encontrada...");




}


}
}

class Main {

	public static void main (String[] args) {

		String nome = "Sanduíche de Presunto do Chaves";
		String descricao = "Sanduíche de presunto simples...";
		boolean emPromocao = true;
		double preco = 3.50;
		double precoComDesconto = 2.99;
		long id = 3_000_000_000L;
		int categoria = 2;

		if (categoria == 1) {
 		IO.println("Categoria: Entradas");

		} else if (categoria == 2) {
 	
			IO.println("Categoria: Pratos Principais");
	
		}else if (categoria == 3) {
 
			IO.println("Categoria: Sobremesas");

		} else if (categoria == 4) {
 
			IO.println("Categoria: Bebidas");

		} else {
 
			IO.println("Categoria não encontrada...");
}

// A mesma lógica usando switch-case

switch(categoria) {
 
	case 1:
 
	IO.println("Categoria: Entradas");
 
	break; // Impede o "fall-through" para o próximo case
 
	case 2:
 
	IO.println("Categoria: Pratos Principais");
 
	break;
 
	case 3:
 
	IO.println("Categoria: Sobremesas");
 
	break;
 
	case 4:
 
	IO.println("Categoria: Bebidas");

	break;
 
	default: // Equivalente ao "else"
 
	IO.println("Categoria não encontrada...");




}

}
}

