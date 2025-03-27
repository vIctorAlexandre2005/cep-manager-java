package api.cepmanager.entity;

import api.cepmanager.dto.AddressDataDTO;
import api.cepmanager.dto.UpdateAddressDTO;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Embeddable
public class Address {
    private String zip_code;
    private String street;
    private String district;
    private String city;
    private String uf;
    private Timestamp created_at;

    public Address(AddressDataDTO addressDataDTO) {
        this.zip_code = addressDataDTO.zip_code();
        this.street = addressDataDTO.street();
        this.district = addressDataDTO.district();
        this.city = addressDataDTO.city();
        this.uf = addressDataDTO.uf();
        this.created_at = addressDataDTO.created_at();
    }

    public Address(String cep) {
        this.zip_code = cep;
    }


    public void updateInfo(UpdateAddressDTO adress) {
        this.zip_code = adress.zip_code();
    }
}
