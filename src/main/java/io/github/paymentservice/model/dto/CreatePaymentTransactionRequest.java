package io.github.paymentservice.model.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class CreatePaymentTransactionRequest {
    @NotNull
    private Long sourceBankAccountId;
    private Long destinationBankAccountId;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private String currency;
    private String description;
}
