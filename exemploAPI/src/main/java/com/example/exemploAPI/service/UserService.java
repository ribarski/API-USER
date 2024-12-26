package com.example.exemploAPI.service;


import com.example.exemploAPI.entity.User;
import com.example.exemploAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUserAll (){
        List<User> user = userRepository.findAll();
        if (user.isEmpty()) {
            throw new RuntimeException("Não encontramos usuarios listados");
        }
        return user;
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public User replace(Long id, User user){
        User existeUser = userRepository.findById(id).orElse(null);

        if (existeUser != null){
            existeUser.setNome(user.getNome());

            return userRepository.save(existeUser);
        } else {
            return null;
        }
    }
    public boolean delete(Long id) {
        User user = userRepository.findById(id).orElse(null);

        if (user != null) {
            userRepository.delete(user);
            return true;
        } else {
            return false;
        }
    }

}
