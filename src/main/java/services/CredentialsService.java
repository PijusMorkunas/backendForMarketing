package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CredentialsRepository;

@Service
public class CredentialsService {
    @Autowired
    private CredentialsRepository credentialsRepository;
}
