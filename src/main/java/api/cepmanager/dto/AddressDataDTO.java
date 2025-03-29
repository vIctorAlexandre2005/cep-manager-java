package api.cepmanager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.sql.Timestamp;

public record AddressDataDTO(
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String zip_code,

        @NotBlank
        String street,
        @NotBlank
        String district,
        @NotBlank
        String city,
        @NotBlank
        String uf
) {
}
