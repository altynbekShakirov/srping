package org.example.service;

import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * The golden boy
 */
@Component("email")
@ToString
public class EmailService implements Chat {
    public String getMessage() {
        return "EmailService";
    }
}
