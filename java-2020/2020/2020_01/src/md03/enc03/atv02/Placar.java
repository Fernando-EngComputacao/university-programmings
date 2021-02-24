package md03.enc03.atv02;

public class Placar{
	private int tentativas;
	private int sorteado;
	private boolean win;
	
	public boolean getWin() {
		return this.win;
	}
	
	public Placar(int tentativas, int sorteado, boolean win) {
		this.sorteado = sorteado;
		this.tentativas = tentativas;
		this.win = win;
	}

	
	public String toString() {
		String texto = "-> Voc� venceu!!!\n";
	
		if (this.getWin() == false) 
			texto = "-> Voc� Perdeu!\n";
		
		return "*************** PLACAR : MAIOR-MENOR ***************\n"+texto+
				"N� de tentativas: "+tentativas+"\nN� sorteado: "+sorteado;
	}
}
