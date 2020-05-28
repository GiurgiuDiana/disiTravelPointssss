package com.university.disi.controller;

import com.university.disi.dto.EmailDTO;
import com.university.disi.response.ApiResponse;
import com.university.disi.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/informationEmail")
public class EmailController {
    @Autowired
    private EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ApiResponse<Void> sendEmailToRequestInformation(@RequestBody EmailDTO emailDTO) {
        emailService.sendEmailToRequestInformation(emailDTO);
        return new ApiResponse<>(HttpStatus.OK.value(), "Email sent successfully.", null );
    }
}
