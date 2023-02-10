package org.example;

import lombok.*;
import org.example.service.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * The golden boy
 */
@Component
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class MessagePrinter {

    private Chat chat;
    @Value("${name}")
    private  String name  ;
    @Value("${phone_number}")
     private  String phoneNumber ;
     @Autowired
    public MessagePrinter(@Qualifier("sms") Chat chat) {
        this.chat = chat;
    }
    @PostConstruct
    void init(){
        System.out.println("hello");
    }
    @PreDestroy
    void destroy(){
        System.out.println("bay");
    }
    @Bean
    String bean(){
         return "Ra ta ta ta ta !!!";
    }

}
