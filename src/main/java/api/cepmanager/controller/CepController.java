package api.cepmanager.controller;

import api.cepmanager.dto.UsersDataDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class CepController {
    @PostMapping
    public ResponseEntity saveAddress(@RequestBody UsersDataDTO usersDataDTO) {
        System.out.println(usersDataDTO);
        return ResponseEntity.ok(usersDataDTO);
    }
}
