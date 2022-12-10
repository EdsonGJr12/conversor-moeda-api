package br.com.conversormoeda.controller.model;

import java.math.BigDecimal;

public class ConversorMoedaModel {
	private BigDecimal valorConvertido;
	
	public ConversorMoedaModel(BigDecimal valorConvertido) {
		this.valorConvertido = valorConvertido;
	}
	
	public BigDecimal getValorConvertido() {
		return valorConvertido;
	}
}
