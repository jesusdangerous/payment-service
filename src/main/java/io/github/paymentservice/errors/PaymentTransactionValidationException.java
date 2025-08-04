package io.github.paymentservice.errors;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PaymentTransactionValidationException extends RuntimeException {
    private List<String> errors;
}
