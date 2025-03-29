package api.cepmanager.dto;

import api.cepmanager.entity.Address;
import api.cepmanager.entity.Users;

import java.sql.Timestamp;

public record DataListAddressDTO(Long id, String name, String cpf, Timestamp created_at, Address address) {
    public DataListAddressDTO(Users users) {
        this(users.getId(), users.getName(), users.getCpf(), users.getCreated_at(), users.getAddress());
    }
}
