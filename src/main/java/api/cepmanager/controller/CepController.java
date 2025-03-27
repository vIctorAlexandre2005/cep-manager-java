package api.cepmanager.controller;

import api.cepmanager.dto.DataListAddressDTO;
import api.cepmanager.dto.UsersDataDTO;
import api.cepmanager.entity.Users;
import api.cepmanager.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class CepController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    @Transactional
    public ResponseEntity saveAddress(@RequestBody @Valid UsersDataDTO usersDataDTO) {
        System.out.println(usersDataDTO);
        userRepository.save(new Users(usersDataDTO));
        return ResponseEntity.ok(usersDataDTO);
    }

    @GetMapping
    public Page<DataListAddressDTO> getAddress(Pageable pagination) {
        var listDataAddress = userRepository.findAll(pagination).map(DataListAddressDTO::new);
        return listDataAddress;
    }
}
