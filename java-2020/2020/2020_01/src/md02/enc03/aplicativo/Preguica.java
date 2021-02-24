package md02.enc03.aplicativo;

public class Preguica extends Animal {

	// Da Super Classe \\
	public Preguica() {
		super();
	}

	public Preguica(String nn, int id) {
		super(nn, id);
	}

	// M�todos \\
	public void emitirSom() {
		super.emitirSom();
		System.out.println("Balindo");
	}

	public void sobeEmArvore() {
		System.out.println("Pregui�a a subir em �rvove");
	}

}
