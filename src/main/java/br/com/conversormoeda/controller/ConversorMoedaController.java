package br.com.conversormoeda.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.conversormoeda.controller.form.ConversorMoedaForm;
import br.com.conversormoeda.controller.model.ConversorMoedaModel;
import br.com.conversormoeda.domain.TipoMoeda;

@RestController
@RequestMapping("/conversao-moeda")
public class ConversorMoedaController {

	@PostMapping
	public ConversorMoedaModel converter(@RequestBody ConversorMoedaForm conversorMoeda) {
		TipoMoeda tipoMoeda = conversorMoeda.getTipoMoeda();
		BigDecimal valorConvertido = tipoMoeda.converterParaReal(conversorMoeda.getValor());
		return new ConversorMoedaModel(valorConvertido);
	}
}
