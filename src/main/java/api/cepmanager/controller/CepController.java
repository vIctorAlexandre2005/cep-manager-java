package api.cepmanager.controller;

import api.cepmanager.dto.DataListAddressDTO;
import api.cepmanager.dto.DataUpdateAddressDTO;
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
    private UserRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity saveAddress(@RequestBody @Valid UsersDataDTO usersDataDTO) {
        System.out.println(usersDataDTO);
        repository.save(new Users(usersDataDTO));
        return ResponseEntity.ok(usersDataDTO);
    }

    @GetMapping
    public ResponseEntity<Page<DataListAddressDTO>> getAddress(Pageable pagination) {
        var listDataAddress = repository.findAllByActiveTrue(pagination).map(DataListAddressDTO::new);
        return ResponseEntity.ok(listDataAddress);
    }

    @GetMapping("/{id}")
    public ResponseEntity getAddressDetails(@PathVariable Long id) {
        var addressDetailsId = repository.getReferenceById(id);
        return ResponseEntity.ok(new DataListAddressDTO(addressDetailsId));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity updateAddress(@RequestBody @Valid DataUpdateAddressDTO dataUpdate) {
        try {
            var dataAddress = repository.getReferenceById(dataUpdate.id());
            dataAddress.updateData(dataUpdate);

            return ResponseEntity.ok().build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteAddress(@PathVariable Long id) {
        var addressId = repository.getReferenceById(id);
        addressId.delete();
        return ResponseEntity.noContent().build();
    }
}
