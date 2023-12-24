package project.commerce.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.commerce.domain.SignUpForm;
import project.commerce.domain.model.User;
import project.commerce.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class SignUpUserService {

    private final UserRepository userRepository;

    public User signUp(SignUpForm form){
        return userRepository.save(User.from(form));
    }
}
