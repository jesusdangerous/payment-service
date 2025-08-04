package io.github.paymentservice.model.dto.enums;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public enum CommandResultStatus {
    SUCCESS,
    FAILED;

    public static CommandResultStatus fromString(String status) {
        for (CommandResultStatus commandResultStatus : CommandResultStatus.values()) {
            if (commandResultStatus.toString().equalsIgnoreCase(status)) {
                return commandResultStatus;
            }
        }
        throw new IllegalArgumentException("Invalid CommandResultStatus " + status);
    }
}
