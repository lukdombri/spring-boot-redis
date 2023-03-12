package eu.britenet.springbootredis.service;

import eu.britenet.springbootredis.entity.User;
import eu.britenet.springbootredis.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import javax.management.AttributeNotFoundException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }

    @SneakyThrows
    public User get(String id){
        return userRepository.findById(id).orElseThrow(AttributeNotFoundException::new);
    }
}
