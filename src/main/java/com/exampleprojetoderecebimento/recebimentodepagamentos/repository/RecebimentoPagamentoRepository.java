package com.exampleprojetoderecebimento.recebimentodepagamentos.repository;

import com.exampleprojetoderecebimento.recebimentodepagamentos.model.RecebimentoPagamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecebimentoPagamentoRepository extends JpaRepository<RecebimentoPagamentoModel, Long> {
}
