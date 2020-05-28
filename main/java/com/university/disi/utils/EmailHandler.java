package com.university.disi.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * @author Miruna
 */

public class EmailHandler {
    private static final String EMAIL_DATA_FILE_PATH = "email.properties";
    private static final Logger LOGGER = LoggerFactory.getLogger(EmailHandler.class);
    private static Properties properties = new Properties();

    private void fetchConfigurations() {
        try (InputStream input = this.getClass().getClassLoader().getResourceAsStream(EMAIL_DATA_FILE_PATH);) {
            properties.load(input);
            LOGGER.info("Configuration data loaded successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void send(final String recipient, final String subject, final String text) throws MessagingException {
        fetchConfigurations();
        final Session mailSession = Session.getDefaultInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(properties.getProperty("mail.username"), properties.getProperty("mail.password"));
            }
        });
        final Message simpleMessage = new MimeMessage(mailSession);
        simpleMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
        simpleMessage.setSubject(subject);
        simpleMessage.setText(text);
        Transport.send(simpleMessage);
        LOGGER.info("Email sent successfully !");
    }
}
