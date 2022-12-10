package br.com.conversormoeda.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DolarParaReal implements ConversorMoeda {

	private static final double COTACAO_DOLAR = 5.24;

	@Override
	public BigDecimal converter(BigDecimal valor) {
		return valor.multiply(BigDecimal.valueOf(COTACAO_DOLAR))
				.setScale(2, RoundingMode.FLOOR);
	}

}
