package br.com.conversormoeda.controller.form;

import java.math.BigDecimal;

import br.com.conversormoeda.domain.TipoMoeda;

public class ConversorMoedaForm {
	private BigDecimal valor;
	private TipoMoeda tipoMoeda;

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoMoeda getTipoMoeda() {
		return tipoMoeda;
	}

	public void setTipoMoeda(TipoMoeda tipoMoeda) {
		this.tipoMoeda = tipoMoeda;
	}
}
