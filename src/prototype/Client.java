package prototype;

public class Client {

	public static void main(String[] args) {
		
		//A partir de uma instância de um protótipo
		//é possível criar vários objetos a partir da cópia deste protótipo.
		//Intenção:
		//Criar objetos protótipos com as propriedades previamente setadas
		
		FiestaPrototype prototipoFiesta = new FiestaPrototype();

		CarroPrototype fiestaNovo = prototipoFiesta.clonar();
		fiestaNovo.setValorCompra(45000.0);
		
		CarroPrototype fiestaUsado = prototipoFiesta.clonar();
		fiestaUsado.setValorCompra(23000.0);

		System.out.println(fiestaNovo.exibirInfo());
		System.out.println(fiestaUsado.exibirInfo());

	}

}
