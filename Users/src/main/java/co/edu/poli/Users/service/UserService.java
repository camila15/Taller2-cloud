package co.edu.poli.Users.service;


import co.edu.poli.Users.domain.User;
import co.edu.poli.Users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User adicionarUser(User user)
    {
        return userRepository.save(user);
    }

    public List<User> obteneruser()
    {
        return userRepository.findAll();
    }

    public void eliminaruser(Long id)
    {
         userRepository.deleteById(id);
    }

}
