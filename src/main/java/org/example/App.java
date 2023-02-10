package org.example;

import org.example.config.Config;
import org.example.service.EmailService;
import org.example.service.SMSService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
         SMSService smsService= context.getBean("sms",SMSService.class);
         MessagePrinter messagePrinter= new MessagePrinter();
        System.out.println(messagePrinter.bean());
        System.out.println(smsService);
        context.close();
    }
}
