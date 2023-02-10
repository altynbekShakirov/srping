package org.example.service;

import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * The golden boy
 */
@Component("sms")
@ToString
public class SMSService implements Chat {

    public String getMessage() {
        return "SMS";
    }
}
