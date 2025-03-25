package api.cepmanager.entity;

import api.cepmanager.dto.AddressDataDTO;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Embeddable

public class Address {
    private String zipCode;
    private String street;
    private String district;
    private String city;
    private String uf;
    private Timestamp created_at;

    public Address(AddressDataDTO addressDataDTO) {
        this.zipCode = addressDataDTO.zipCode();
        this.street = addressDataDTO.street();
        this.district = addressDataDTO.district();
        this.city = addressDataDTO.city();
        this.uf = addressDataDTO.uf();
        this.created_at = addressDataDTO.created_at();
    }
}
