package io.github.paymentservice.model.enums.converter;

import io.github.paymentservice.model.enums.PaymentTransactionStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class PaymentTransactionStatusConverter implements AttributeConverter<PaymentTransactionStatus, String> {
    @Override
    public String convertToDatabaseColumn(PaymentTransactionStatus paymentTransactionStatus) {
        return paymentTransactionStatus == null ? null : paymentTransactionStatus.name();
    }

    @Override
    public PaymentTransactionStatus convertToEntityAttribute(String s) {
        return s == null ? null : PaymentTransactionStatus.fromString(s);
    }
}
