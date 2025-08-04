package io.github.paymentservice.service;

import io.github.paymentservice.model.entity.BankAccount;
import io.github.paymentservice.repository.BankAccountRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class BankAccountService {
    private final BankAccountRepository bankAccountRepository;

    @Transactional
    public Optional<BankAccount> findById(Long id) {
        return bankAccountRepository.findById(id);
    }
}
