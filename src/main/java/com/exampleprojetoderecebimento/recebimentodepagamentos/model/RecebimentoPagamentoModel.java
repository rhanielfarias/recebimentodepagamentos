package com.exampleprojetoderecebimento.recebimentodepagamentos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recebimento")
public class RecebimentoPagamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long codigo;

    @Column(length = 50, nullable = false)
private  String recebimento;

    @Column(length = 50, nullable = false)
private BigDecimal valorRecebido;
    @Column(length = 50, nullable = false)
private  BigDecimal descontarDoRecebido;

    @Column(length = 50, nullable = false)
    private  BigDecimal valorFinal;
}
