package br.com.conversormoeda.domain;

import java.math.BigDecimal;

public interface ConversorMoeda {
	BigDecimal converter(BigDecimal valor);
}
