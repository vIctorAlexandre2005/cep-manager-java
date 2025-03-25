package api.cepmanager.dto;

import java.sql.Timestamp;

public record AddressDataDTO(
        String zip_code,
        String street,
        String district,
        String city,
        String uf,
        Timestamp created_at
) {
}
