package api.cepmanager.controller;

import api.cepmanager.dto.UsersDataDTO;
import api.cepmanager.entity.Address;
import api.cepmanager.entity.Users;
import api.cepmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class CepController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity saveAddress(@RequestBody UsersDataDTO usersDataDTO) {
        userRepository.save(new Users(usersDataDTO));
        return ResponseEntity.ok(usersDataDTO);
    }
}
