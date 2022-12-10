package br.com.conversormoeda.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EuroParaReal implements ConversorMoeda {

	private static final double COTACAO_EURO = 5.52;

	@Override
	public BigDecimal converter(BigDecimal valor) {
		return valor.multiply(BigDecimal.valueOf(COTACAO_EURO))
				.setScale(2, RoundingMode.FLOOR);
	}

}
