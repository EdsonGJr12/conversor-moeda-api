package br.com.conversormoeda.domain;

import java.math.BigDecimal;

public enum TipoMoeda {
	DOLAR(new DolarParaReal()),
	EURO(new EuroParaReal());

	private ConversorMoeda conversorMoeda;

	TipoMoeda(ConversorMoeda conversorMoeda) {
		 this.conversorMoeda = conversorMoeda;
	}

	public BigDecimal converterParaReal(BigDecimal valor) {
		return conversorMoeda.converter(valor);
	}
}
