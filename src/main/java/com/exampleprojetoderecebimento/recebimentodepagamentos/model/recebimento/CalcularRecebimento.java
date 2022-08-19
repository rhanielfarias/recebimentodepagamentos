package com.exampleprojetoderecebimento.recebimentodepagamentos.model.recebimento;

import com.exampleprojetoderecebimento.recebimentodepagamentos.model.RecebimentoPagamentoModel;

import java.math.BigDecimal;

public interface CalcularRecebimento {
    public BigDecimal calcularPagamento(RecebimentoPagamentoModel recebimentoPagamentoModel);
}
