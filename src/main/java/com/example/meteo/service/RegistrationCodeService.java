package com.example.meteo.service;

import com.example.meteo.dao.RegistrationCodeDAO;
import com.example.meteo.model.RegistrationCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationCodeService {

    @Autowired
    RegistrationCodeDAO registrationCodeDAO;

    public void insert(RegistrationCode registrationCode) {
        registrationCodeDAO.save(registrationCode);
    }
    public boolean checkRegistrationCode(RegistrationCode registrationCode) {
        List<RegistrationCode> registrationCodeList = registrationCodeDAO.findAll();
        if(registrationCodeList.contains(registrationCode)) {
            return true;
        }
        return false;
    }
    public void removeRegistrationCode(RegistrationCode registrationCode) {
        registrationCodeDAO.delete(registrationCode);
    }


}
