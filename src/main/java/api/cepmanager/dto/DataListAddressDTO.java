package api.cepmanager.dto;

import api.cepmanager.entity.Address;
import api.cepmanager.entity.Users;

public record DataListAddressDTO(Long id, String name, String cpf, Address address) {
    public DataListAddressDTO(Users users) {
        this(users.getId(), users.getName(), users.getCpf(), users.getAddress());
    }
}
