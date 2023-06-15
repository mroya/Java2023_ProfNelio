package orientacaoObjetos.entities;

public class CurrencyConverter {

	public static double cotacao(double priceDollar, double qtDollar) {
		double vlrReais = priceDollar * qtDollar;
		return (vlrReais * 0.06) + vlrReais;
	}

}
