package md03.enc04.va;

public class Carro extends Veiculo {

	public Carro(String tipo, double combustivel, double limiteCombustivel, double gastoKM) {
		super((tipo).toUpperCase(), combustivel, limiteCombustivel, gastoKM);
	}
	@Override
	public void dirigir(double distanciaKM) {
		double aux = (this.getCombustivel()-(distanciaKM/this.getGastoKM()))-0.9;
		try {
			if (aux < 0) {
				throw new CombustivelException("Dist�ncia percorrida incompat�vel com o combust�vel atual no tanque!");
			}
			this.setCombustivel(aux);
		} catch (CombustivelException e) {
			System.out.println(e.getMessage());
		}
	}
	public void abastecer(String tipoCombustivel, double qntL) {
		String tC = tipoCombustivel.toUpperCase();
		try {
			if (tC.equals("GASOLINA") || tC.equals("�LCOOL") || tC.equals("FLEX")) {
				if (!(this.getTipo().equals("FLEX")) && (!this.getTipo().equals((tC).toUpperCase())))
					throw new CombustivelException("Combust�vel Incompat�vel!");
				if ((qntL+this.getCombustivel()) > this.getLimiteCombustivel() || qntL < 0) 
					throw new LimiteException();
				this.setCombustivel(this.getCombustivel()+qntL);
			}
			else
				throw new CombustivelException("Combust�vel Incompat�vel!");
		} catch(LimiteException | CombustivelException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
