package com.university.disi.service;

import com.university.disi.dto.EmailDTO;

public interface EmailService {
    void sendEmailToRequestInformation(EmailDTO emailDTO);
}
