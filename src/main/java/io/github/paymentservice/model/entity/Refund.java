package io.github.paymentservice.model.entity;

import io.github.paymentservice.model.enums.RefundStatus;
import io.github.paymentservice.model.enums.converter.RefundStatusConverter;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Refund extends BaseEntity {
    private BigDecimal refundedAmount;
    private String reason;

    @Convert(converter = RefundStatusConverter.class)
    private RefundStatus status;

    @ManyToOne
    @JoinColumn(name = "paymentTransactionId", referencedColumnName = "id")
    private PaymentTransaction paymentTransaction;
}
