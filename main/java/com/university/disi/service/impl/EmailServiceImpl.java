package com.university.disi.service.impl;

import com.university.disi.dto.EmailDTO;
import com.university.disi.entity.loginEntity.Tourist;
import com.university.disi.repository.loginRepository.TouristRepository;
import com.university.disi.service.EmailService;
import com.university.disi.service.loginService.TouristService;
import com.university.disi.service.loginService.UserService;
import com.university.disi.utils.EmailHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.util.Optional;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private TouristRepository touristRepository;

    private EmailHandler emailHandler;
    private TouristService touristService;

    public EmailServiceImpl(TouristService touristService) {
        this.emailHandler = new EmailHandler();
        this.touristService = touristService;
    }

    @Override
    public void sendEmailToRequestInformation(EmailDTO emailDTO) {

        //password:atravelpoints2020
        final String recipientAddress = "atravelpoints@gmail.com";
        final String subject = emailDTO.getSubject();
        emailDTO.setSubject(subject);

        final int touristId = emailDTO.getTouristId();
        Optional<Tourist> optionalTourist = touristRepository.findById(touristId);
        Tourist tourist = optionalTourist.isPresent() ? optionalTourist.get() : null;

        final String message = "This email was sent by: "+ "\n" + emailDTO.getMessage();

        emailDTO.setMessage(message);

        try {
            emailHandler.send(recipientAddress, subject, message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }


}
